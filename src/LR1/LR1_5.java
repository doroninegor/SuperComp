package LR1;

import java.util.Scanner;

public class LR1_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.print("Введите число c: ");
        int c = in.nextInt();
        int min = 0;
        if (a<b){
            min = a;
        }else {
            min = b;
        }if (c<min){
            min = c;
        }System.out.print(min);
    }
}
