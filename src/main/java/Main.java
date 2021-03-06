import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by John on 10/29/16.
 */
public class Main {

    private static final int NUM_OF_CARS = 10;
    private static final int MIN_COST = 1000;
    private static final int MAX_COST = 100000;
    private static final int MIN_FEE = 10;
    private static final int MAX_FEE = 100;

    private static void printStart(String message) {
        System.out.println("_______________________________________");
        System.out.println(message);
        System.out.println("...");
    }

    private static int getRandomIntBetween(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }

    public static void main(String[] args) {

        List<Car> models = new ArrayList<>();
        Colors[] colorsArray = Colors.values();
        Random r = new Random();

        for (int i = 0; i < NUM_OF_CARS; i++) {
            models.add(new Car(colorsArray[r.nextInt(5)],
                    getRandomIntBetween(MIN_COST, MAX_COST),
                    getRandomIntBetween(MIN_FEE, MAX_FEE)
            ));
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
        for (Object model : modelArray) {
            System.out.println(((Car) model).getColor());
        }
        System.out.println("_______________________________________");

        //Perform the reduce terminal operation
        printStart("reduce terminal operation");
        OptionalInt allCosts = models.stream()
                .mapToInt(c -> c.getStickerCost())
                .reduce((a, b) -> a + b);
        System.out.println("All costs " + allCosts.toString());
        System.out.println("_______________________________________");



        //Perform the min terminal operation
        printStart("min terminal operation");
        Optional<Car> min = models.stream().min((c1, c2) -> {
            if (c1.getTotalCost() > c2.getTotalCost()) {
                return 1;
            } else if (c1.getTotalCost() > c2.getTotalCost()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println("Min costs " + min.toString());
        System.out.println("_______________________________________");


        //Perform the max terminal operation
        printStart("max terminal operation");
        Optional<Car> max = models.stream().max((c1, c2) -> {
            if (c1.getTotalCost() > c2.getTotalCost()) {
                return 1;
            } else if (c1.getTotalCost() > c2.getTotalCost()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println("Max costs " + max.toString());
        System.out.println("_______________________________________");

        //Perform the count terminal operation
        printStart("Count terminal operation");
        System.out.println("The number of models is: " + models.stream().count());
        System.out.println("_______________________________________");
    }
}
