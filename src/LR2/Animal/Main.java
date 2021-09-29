package LR2.Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Мясо","Вольер","Пират");
        animals[1] = new Cat("Рыба", "В доме", "Мурзик");
        animals[2] = new Horse("Сено", "Ферма", "Спирит");
        for (int i=0; i<animals.length; i++){
            Veterinary.treatAnimal(animals[i]);

        }
}
}
