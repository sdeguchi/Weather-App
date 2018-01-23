import com.jsoniter.JsonIterator;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing .JTextField;



public class WeatherGUI{

    public static void main(String[] args) {

        JFrame f = new JFrame("A JFrame");
        f.setSize(250, 250);
        f.setLocation(300,200);
        JTextField textField = new JTextField(8);
        textField.setFont(textField.getFont().deriveFont(12f));
        f.getContentPane().add(BorderLayout.NORTH, textField);
        final JTextArea textArea = new JTextArea(10, 40);
        f.getContentPane().add(BorderLayout.CENTER, textArea);
        final JButton button = new JButton("Get City Weather");
        f.getContentPane().add(BorderLayout.SOUTH, button);

        APIrequest api = new APIrequest();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result ="";
                String city = textField.getText();
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
