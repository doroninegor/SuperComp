package LR5;

public class zd14 {
    public static void main(String[] args) {
        System.out.println(qwer("asdfghas"));
    }
    private static String qwer(String Str) {
        char[] arr1 = Str.toCharArray();
        String targetStr = "";
        for (char i: arr1) {
            if (targetStr.indexOf(i) == -1) {
                targetStr += i;
            }
        }
        return targetStr;
    }
}

