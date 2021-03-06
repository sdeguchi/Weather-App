import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIrequest {


    public String getHTML(String city, String API) throws IOException {
        String APIkey = "&APPID=8268f3b2e8feb0f6da6bc59a59929958";
        StringBuilder content = new StringBuilder();

        try {
            URL url = new URL(API + city + APIkey);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
        } catch (IOException e) {
            System.err.println();
        }

        return content.toString();
    }
}
