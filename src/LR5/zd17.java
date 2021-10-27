package LR5;

public class zd17 {
    public static void main(String args[]){
        System.out.println(noOfTriples("aaabbcccljjj"));
    }
    public static int noOfTriples(String str)
    {
        int l = str.length();
        int k = 0;
        for (int i = 0; i < l-2; i++)
        {
            char tmp = str.charAt(i);
            if (tmp == str.charAt(i+1) && tmp == str.charAt(i+2))
                k++;
        }
        return k;
    }
}
