package LR5;

public class zd16 {
    public static void main(String args[]){
        System.out.println(firstInLast("adfhfhghad"));
    }
    public static boolean firstInLast(String str){
        if (str.length() < 2)
            return false;
        else if (str.substring(0,2).equals(str.substring(str.length()-2, str.length())))
            return true;
        else
            return false;
    }

}
