import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by John on 10/29/16.
 */
public class Main {

    private static final int NUM_OF_CARS = 10;

    public static void main(String[] args) {

        List<Car> models = new ArrayList<>();
        Colors[] colorsArray = Colors.values();
        Random r = new Random();

        for(int i = 0; i < NUM_OF_CARS; i++){
            models.add(new Car(colorsArray[r.nextInt(5)]));
        }

        //List of terminal operations in the Stream<T> interface
        //forEach, forEachOrdered, toArray, reduce, collect, min, max, count,

        //Perform the forEach terminal operation on the stream
        System.out.println("_______________________________________");
        System.out.println("forEach terminal operation");
        System.out.println("...");
        models.stream().forEach(car -> System.out.println(car.getColor()));
        System.out.println("_______________________________________");

        //Perform the forEachOrdered terminal operation on the stream
        System.out.println("_______________________________________");
        System.out.println("forEachOrdered terminal operation");
        System.out.println("...");
        models.stream().forEachOrdered(car -> System.out.println(car.getColor()));
        System.out.println("_______________________________________");

    }
}
