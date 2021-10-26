package LR5;

public class zd13 {
    public static void main(String[] args) {
        System.out.println(abg("bbbdaaku"));
    }
    public static char abg(String str) {
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                k = k + 1;
            }
            for (int j = k + 1; k < str.length(); j++) {
                char max;
                if (str.charAt(j) == str.charAt(j + 1))
                    return max = str.charAt(j);
                }
            }
            return 0;
        }
    }
