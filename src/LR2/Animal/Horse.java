package LR2.Animal;

import LR2.Animal.Animal;

public class Horse extends Animal {
    String name;
    public Horse(String food, String location, String name) {
        super(food,location);
        this.name = name;
    }
    public void makeNoise(){
        System.out.println("Игого");
    }
    public void eat(){
        System.out.println("Трава, сено");
    }
}
