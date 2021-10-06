package LR3.Flowers;

public class Rose extends Flower {
    int price;
    public Rose(int price){
        super(price);
    }
    public int getPrice(){
        return price * 120;
    }

}
