package LR5;

public class zd8 {
    public static void main(String args[]){
        String str = "Привет, Мир";
        boolean a1 = str.endsWith("Мир");
        boolean a2 = str.endsWith("Привет");
        System.out.println("Строка "+str + "заканчивается на 'Мир':" + a1);
        System.out.println("Строка "+str + "заканчивается на 'Привет':" + a2);
    }
}
