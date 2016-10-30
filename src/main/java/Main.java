import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 10/29/16.
 */
public class Main {
    public static void main(String[] args) {
        List<Car> models = new ArrayList<>();
        models.add(new Car(Colors.BLUE));
        models.add(new Car(Colors.GREEN));
        models.add(new Car(Colors.ORANGE));
        models.add(new Car(Colors.PURPLE));
        models.add(new Car(Colors.RED));
        models.add(new Car(Colors.YELLOW));
    }
}
