import com.jsoniter.JsonIterator;
import com.jsoniter.any.Any;
import com.jsoniter.spi.TypeLiteral;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class WeatherGUI{

    public static void main(String[] args) {
        String jsonString = "";
        ArrayList<City> city = new ArrayList<>();
        try {
            InputStream is = new FileInputStream("city.list.json");
            BufferedReader buf = new BufferedReader(new InputStreamReader(is));
            String line = buf.readLine();
            StringBuilder sb = new StringBuilder();
            while (line != null) {
                sb.append(line).append("\n");
                line = buf.readLine();
            }
            jsonString = sb.toString();
            city = JsonIterator.deserialize(jsonString, new TypeLiteral<ArrayList<City>>(){});
        }catch(IOException e){
        }
        ArrayList<String> cityNames = new ArrayList<>();

        for(City c:city){
            cityNames.add(c.name + ", " + c.country);
        }
        Collections.sort(cityNames);
        Java2sAutoComboBox cb = new Java2sAutoComboBox(cityNames);


        JFrame f = new JFrame("Weather App");
        f.setSize(500, 300);
        f.setLocation(300,200);
        cb.setFont(cb.getFont().deriveFont(12f));
        f.getContentPane().add(BorderLayout.NORTH, cb);
        cb.getEditor().setItem("");
        final JTextArea textArea = new JTextArea(10, 40);
        textArea.setEditable(false);
        textArea.setText("Type \"City name, Country\" for weather information. Eg. Seattle, US");
        f.getContentPane().add(BorderLayout.CENTER,textArea);

        APIrequest api = new APIrequest();
        cb.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent event) {
                if (event.getKeyChar() == KeyEvent.VK_ENTER) {
                    String result = "";
                    String city = cb.getSelectedItem().toString();
                    if(!city.isEmpty()){
                    try {
                        result = api.getHTML(city, "http://api.openweathermap.org/data/2.5/weather?q=");
                        JsonIterator iter = JsonIterator.parse(result.replace('\'', '"'));
                        Weather w = iter.read(Weather.class);
                        textArea.setText("");
                        textArea.append("City: " + w.name + "\n");
                        textArea.append("Date: " + w.getDate() + "\n");
                        textArea.append("Time: " + w.getTime() + "\n");
                        textArea.append("Weather: " + w.getWeather() + "\n");
                        textArea.append("Description: " + w.getWeatherDescription() + "\n");
                        textArea.append("Current Temp: " + String.format("%.2f", w.getTempF()) + " F\n");
                        textArea.append("Wind Speed: " + w.getWindSpeed() + " M/sec\n");
                        textArea.append("Wind Direction: " + w.getWindDegree() + "\u00b0\n");
                        textArea.append("Pressure: " + w.getPressure() + " hPa\n");
                        textArea.append("Humidity: " + w.getHumidity() + "%\n");
                        result = api.getHTML(city, "http://api.openweathermap.org/data/2.5/forecast?q=");
                        textArea.append("\n5-day Forecast:\n");

                        iter = JsonIterator.parse(result.replace('\'', '"'));
                        Any forecast = iter.readAny();
                        ArrayList<Any> f = (ArrayList<Any>) forecast.get("list").asList();
                        TreeMap<String, Double> h = new TreeMap<>();
                        ArrayList<String> des = new ArrayList<>();
                        for (int i = 0; i < forecast.get("cnt").toInt(); i++) {

                            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                            Date date = new Date();
                            date.setTime(f.get(i).get("dt").toLong() * 1000);
                            if (!h.containsKey(dateFormat.format(date))) {
                                h.put(dateFormat.format(date), f.get(i).get("main").get("temp").toDouble());
                                des.add(f.get(i).get("weather").get(0).get("main").toString());
                            } else {
                                h.put(dateFormat.format(date), (h.get(dateFormat.format(date)) + f.get(i).get("main").get("temp").toInt()) / 2f);
                            }
                        }
                        Iterator it = h.entrySet().iterator();
                        it.next();
                        int c = 1;
                        while (it.hasNext()) {
                            HashMap.Entry pair = (HashMap.Entry) it.next();
                            double t = (double) pair.getValue();
                            t = t * 9 / 5 - 459.67;
                            textArea.append(pair.getKey().toString() + " : " + String.format("%.2f", t) + "  " + des.get(c) + "\n");
                            c += 1;
                            it.remove();
                        }
                    } catch (IOException er) {
                    }
                }
                }
            }
        });
        f.setVisible(true);
    }
}

