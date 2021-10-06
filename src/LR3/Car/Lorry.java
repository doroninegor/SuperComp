package LR3.Car;

public class Lorry extends Car{
    int Mass;
    public Lorry(String CarBrand, String CarClass, int Weight, Engine Engine, int Mass){
        super(CarBrand,CarClass,Weight,Engine);
        this.Mass = Mass;
    }
    public void start(){
        System.out.println("Грузовик поехал");
    }
    public void stop(){
        System.out.println("Грузовик остановился");
    }
    public void printInfo() {
        System.out.println("Марка"+ CarBrand + "\n" +"Класс" +CarClass +"\n"+ "Вес" + Weight+"\n"+"Мотор"+Engine+"\n"+"Грузоподъемность"+Mass);
    }
}
