package LR2.Animal;

public class Animal {
    String food;
    String location;

    public Animal(String food, String location){
        this.food=food;
        this.location=location;
    }
    public void makeNoise(){
        System.out.println("Шумит");
    }
    public void eat(){
        System.out.println("Кушает");
    }
    public void sleep(){
        System.out.println("Спит");
    }
}

