import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

        //List of terminal operations in the Stream<T> interface
        //forEach, forEachOrdered, toArray, reduce, collect, min, max, count,

        //Perform the forEach terminal operation on the stream
        System.out.println("_______________________________________");
        System.out.println("For each terminal operation");
        System.out.println("...");
        models.stream().forEach(car -> System.out.println(car.getColor()));
        System.out.println("_______________________________________");

        //Perform the

        Stream<Car> filteredStream = models.stream().filter(car -> car.getColor() == Colors.BLUE);
        filteredStream.forEach(car -> System.out.println(car.getColor()));


    }
}
