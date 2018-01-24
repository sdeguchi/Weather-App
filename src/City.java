
import com.jsoniter.any.Any;

public class City {
    protected int id;
    protected String name;
    protected String country;
    protected Any corrd;


    @Override
    public String toString() {
        return String.format("%s, %s", name, country);
    }
}