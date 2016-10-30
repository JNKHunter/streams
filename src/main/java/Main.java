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

    private static void printStart(String message){
        System.out.println("_______________________________________");
        System.out.println(message);
        System.out.println("...");
    }

    public static void main(String[] args) {

        List<Car> models = new ArrayList<>();
        Colors[] colorsArray = Colors.values();
        Random r = new Random();

        for(int i = 0; i < NUM_OF_CARS; i++){
            models.add(new Car(colorsArray[r.nextInt(5)]));
        }

        //List of terminal operations in the Stream<T> interface
        //forEach, forEachOrdered, toArray, reduce, collect, min, max, count,

        //Perform the forEach terminal operation
        printStart("forEach terminal operation");
        models.stream().forEach(car -> System.out.println(car.getColor()));
        System.out.println("_______________________________________");

        //Perform the forEachOrdered terminal operation
        printStart("forEachOrdered terminal operation");
        models.stream().forEachOrdered(car -> System.out.println(car.getColor()));
        System.out.println("_______________________________________");

        //Perform the toArray terminal operation
        printStart("toArray terminal operation");
        Object[] modelArray = models.stream().toArray();
        for(Object model : modelArray){
            System.out.println(((Car)model).getColor());
        }
        System.out.println("_______________________________________");



    }
}
