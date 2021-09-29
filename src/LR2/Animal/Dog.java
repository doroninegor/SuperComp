package LR2.Animal;

import LR2.Animal.Animal;

public class Dog extends Animal {
    String name;
    public Dog(String food, String location, String name) {
        super(food,location);
        this.name = name;
    }
    public void makeNoise(){
        System.out.println("Гав-Гав");
    }
    public void eat(){
        System.out.println("Мясо");
    }
}
