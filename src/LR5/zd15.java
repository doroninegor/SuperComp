package LR5;

public class zd15 {
    public static void main(String[] args) {
        System.out.println(abg("bbddaaku"));
    }
    public static char abg(String str){
        char currentChar;
        for(int i=0;i<str.length();i++){
            currentChar = str.charAt(i);
            if ((i==0) && (currentChar!=str.charAt(i+1))) {
                return currentChar;
            }
            if ((i != 0) && (currentChar != str.charAt(i - 1)) && (currentChar != str.charAt(i + 1))){
                return currentChar;
            }
            }return 0;
        }
    }
