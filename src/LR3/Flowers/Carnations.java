package LR3.Flowers;

public class Carnations extends Flower{
    int price;
    public Carnations(int price){
        super(price);
    }
    public int getPrice(){
        return price * 40;
    }
}
