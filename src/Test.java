import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.jsoniter.any.Any;
import com.jsoniter.JsonIterator;



public class Test {
String apiCall = "http://api.openweathermap.org/data/2.5/weather?q=Seattle&APPID=8268f3b2e8feb0f6da6bc59a59929958";

    String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        String test = "";
        try {
            test = t.readFile("weather.txt");
            System.out.println(test);
        }catch (IOException e){
        }
        class ABC {
            public Any a; // lazy parsed
        }


//        JsonIterator iter = JsonIterator.parse("{'a': {'b': {'c': 'd'}}}".replace('\'', '"'));
//        ABC abc = new ABC();
//        try {
//            abc = iter.read(ABC.class);
//        }catch(IOException e){
//
//        }
//        System.out.println(abc.a.get("b"));

        JsonIterator iter = JsonIterator.parse(test.replace('\'', '"'));
        Weather w = new Weather();
        try {
            w = iter.read(Weather.class);
        }catch(IOException e){

        }
        System.out.println(w.weather.get(0).get("main"));
        System.out.println(w.getTime());
        System.out.println(w.getDate());
        System.out.println(String.format("%.2f", 14.52135));

//        Any obj = JsonIterator.deserialize(test);
//        System.out.println(obj.get(2));
//        int[] array = JsonIterator.deserialize("[1,2,3]", int[].class);
//        System.out.println(array[2]);


    }


}
