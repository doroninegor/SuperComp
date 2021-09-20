package LR1;

public class LR1_10 {
    public static void main(String[] args) {
        int[] num1 = new int[]{15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int a = num1.length;
        int[] num2 = new int[a];
        int i = 0;
        int j = 0;
        while (i < a) {
            if (num1[i] != 0) {
                num2[j++] = num1[i];
            }
            i = i + 1;
        }
        while (j < a) {
            num2[j++] = 0;
        }
        for (int d = 0; d < num2.length; d++) {
            System.out.print(num2[d] + " ");
        }


    }
}



