package LR3.Flowers;

public class Lily extends Flower{
    int price;
    public Lily(int price){
        super(price);
    }
    public int getPrice(){
        return price * 200;
    }
}
