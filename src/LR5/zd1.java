package LR5;

import java.util.Scanner;

public class zd1 {
    public static void main(String[] args) {
      String wort = "raorttroar";
      char[] warray = wort.toCharArray();
      System.out.println(Palindrom (warray));
    }
    public static boolean Palindrom(char[] Wort){
        int i1 = 0;
        int i2 = Wort.length - 1;
        while (i2 > i1) {
            if (Wort[i1] != Wort[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}