/**
 * Created by John on 10/29/16.
 */
public class Car {

    private Colors color;
    private int cost;

    public Car(Colors color, int cost) {
        this.color = color;
        this.cost = cost;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
