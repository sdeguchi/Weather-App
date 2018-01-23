import com.jsoniter.any.Any;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Weather {
    public Any coord;
    public Any weather;
    public String base;
    public Any main;
    public int visibility;
    public Any wind;
    public Any clouds;
    public long dt;
    public Any sys;
    public long id;
    public String name;
    public int cod;

    public String getWeather() {
        return this.weather.get(0).get("main").toString();
    }

    public String getWeatherDescription() {
        return weather.get(0).get("description").toString();
    }

    public double CtoF(double temp) {
        return temp * 9 / 5 + 32;
    }

    public double KtoC(double temp) {
        return temp - 273.15;
    }

    public double getTempC() {
        return KtoC(main.get("temp").toDouble());
    }


    public double getTempF() {
        return CtoF(getTempC());
    }

    public int getPressure() {
        return main.get("pressure").toInt();
    }

    public int getHumidity() {
        return main.get("humidity").toInt();
    }

    public double[] getTempRange() {
        return new double[]{
                KtoC(main.get("temp_min").toDouble()), KtoC(main.get("temp_max").toDouble())
        };
    }

    public int getVisibility() {
        return visibility;
    }

    public double getWindSpeed() {
        return wind.get("speed").toDouble();
    }

    public int getWindDegree() {
        return wind.get("deg").toInt();
    }

    public int getClouds() {
        return clouds.get("all").toInt();
    }

    public String getCountry() {
        return sys.get("country").toString();
    }

    public String getTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime(dt * 1000);

        return dateFormat.format(date.getTime());
    }

    public String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        date.setTime(dt * 1000);
        return dateFormat.format(date.getTime());
    }

}
