package LR3.Car;

public class SportCar extends Car{
    int MaxSpeed;
    public SportCar(String CarBrand, String CarClass, int Weight, Engine Engine, int MaxSpeed){
        super(CarBrand,CarClass,Weight,Engine);
        this.MaxSpeed=MaxSpeed;
    }
    public void start(){
        System.out.println("SportCar поехал");
    }
    public void stop(){
        System.out.println("SportCar остановился");
    }
    public void printInfo() {
      System.out.println("Марка"+ CarBrand + "\n" +"Класс" +CarClass +"\n"+ "Вес" + Weight+"\n"+"Мотор"+Engine+"\n"+"Предельная скорость"+MaxSpeed);
    }
}
