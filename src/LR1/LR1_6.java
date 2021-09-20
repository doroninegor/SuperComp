package LR1;

import java.util.Scanner;

public class LR1_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        if ((num>0) & (num%2==0)){
                System.out.print("Положительное четное число");
        }if ((num>0) & (num%2!=0)){
            System.out.print("Положительное нечетное число");
        }if ((num<0) & (num%2==0)){
            System.out.print("Отрицательно четное число");
        }if ((num<0) & (num%2!=0)) {
            System.out.print("Отрицательно нечетное число");
        }if (num==0){
            System.out.print("Нулевое число");
        }
    }
}
