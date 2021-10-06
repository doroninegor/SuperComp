package LR3.Flowers;

public class Tulip extends Flower{
    int price;
    public Tulip(int price){
        super(price);
    }
    public int getPrice(){
        return price * 60;
    }
}
