/**
 * Created by John on 10/29/16.
 */
public class Car {

    private Colors color;
    private int stickerCost;
    private int fees;

    public Car(Colors color, int cost, int fees) {
        this.color = color;
        this.stickerCost = cost;
        this.fees = fees;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public int getStickerCost() {
        return stickerCost;
    }

    public void setStickerCost(int stickerCost) {
        this.stickerCost = stickerCost;
    }

    public int getTotalCost(){
        return this.stickerCost + this.fees;
    }
}
