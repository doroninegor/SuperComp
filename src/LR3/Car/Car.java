package LR3.Car;

public abstract class Car {
    String CarBrand;
    String CarClass;
    int Weight;
    Engine Engine;

    public Car(String CarBrand, String CarClass, int Weight, Engine Engine) {
        this.CarBrand = CarBrand;
        this.CarClass = CarClass;
        this.Weight = Weight;
        this.Engine =Engine;
    }
    public abstract void start();
    public abstract void stop();
    public abstract void printInfo();
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }
}