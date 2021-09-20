package LR1;

import java.util.Scanner;

public class LR1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        if (num > 0) {
            System.out.print(num + 1);
        }
        if (num < 0) {
            System.out.print(num - 2);
        }
        if (num == 0) {
            System.out.print(10);
        }
    }
}
