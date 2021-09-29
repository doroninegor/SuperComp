package LR2.Animal;

import LR2.Animal.Animal;

public class Cat extends Animal {
    String name;
    public Cat(String food, String location, String name) {
        super(food,location);
        this.name = name;
    }
    public void makeNoise(){
        System.out.println("Мяу-мяу");
    }
    public void eat(){
        System.out.println("Корм, рыба");
    }
}
