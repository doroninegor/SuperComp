package LR4;

public class Cat extends Animal{
    private String color;
    public Cat(boolean vegetarian, String eats, int noOfLegs,String color) {
        super(vegetarian, eats, noOfLegs);
        this.color= color;
    }
}
