package LR3.Flowers;

public class Flower {
    int price;

    public Flower(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
    class Main{
        public static void main(String[] args) {
            int price = 20;
            Flower rose = new Rose(price);
            Flower lily = new Lily(price);
            Flower carnations = new Carnations(price);
            Flower tulip = new Tulip(price);
            Flower[] bouquet1 ={rose, lily, rose};
            Flower[] bouquet2 ={carnations, tulip, lily, lily,tulip};
            Flower[] bouquet3 ={tulip, rose, lily, tulip};
            System.out.println(bouquet1.length+ bouquet2.length+ bouquet3.length);
        }
    }


