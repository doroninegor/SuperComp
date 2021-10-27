package LR5;

public class zd18 {
    public static void main(String args[]){
            System.out.println(Sum("12asdaaskj307"));
    }
    public static int Sum(String str){
        int k=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)>='0' && str.charAt(i)<= '9')
                k=k+str.charAt(i)-'0';
                }return k;
            }
        }
