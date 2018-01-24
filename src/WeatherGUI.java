import com.jsoniter.JsonIterator;
import com.jsoniter.spi.TypeLiteral;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;



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
            cityNames.add(c.name);
        }
        Collections.sort(cityNames);
        Java2sAutoComboBox cb = new Java2sAutoComboBox(cityNames);


        JFrame f = new JFrame("Weather App");
        f.setSize(500, 500);
        f.setLocation(300,200);
        cb.setFont(cb.getFont().deriveFont(12f));
        f.getContentPane().add(BorderLayout.NORTH, cb);
        final JTextArea textArea = new JTextArea(10, 40);
        final JTextField textField = new JTextField();
        final JButton button = new JButton("Get City Weather");

        f.getContentPane().add(BorderLayout.SOUTH,button);
        f.getContentPane().add(BorderLayout.CENTER,textArea);


        APIrequest api = new APIrequest();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result ="";
                String city = cb.getSelectedItem().toString();
                try {
                    result = api.getHTML(city);
                    JsonIterator iter = JsonIterator.parse(result.replace('\'', '"'));
                    Weather w = iter.read(Weather.class);
                    textArea.setText("");
                    textArea.append("City: " + w.name + "\n");
                    textArea.append("Date: " + w.getDate() + "\n");
                    textArea.append("Time: " + w.getTime() + "\n");
                    textArea.append("Weather: " +  w.getWeather() + "\n");
                    textArea.append("Description: " +  w.getWeatherDescription() + "\n");
                    textArea.append("Temp: " + String.format("%.2f", w.getTempF()) + " F\n");
                    textArea.append("Wind Speed: " + w.getWindSpeed() + " MPH\n");
                }catch(IOException er){

                }



            }
        });

        f.setVisible(true);

    }
}

