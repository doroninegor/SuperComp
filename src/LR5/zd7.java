package LR5;

public class zd7 {
    public static void  main (String [] args) {
        String str1 = "Egor", str2 = "egor";
        CharSequence sr = "Egor";
        System.out.println ("Сравнение " + str1 + " и " + sr + ":" + str1.contentEquals (sr));
        System.out.println ("Сравнение " + str2 + " и " + sr + ":" + str2.contentEquals (sr));
    }
    }
