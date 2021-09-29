package LR2.University;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;
    public Student(String firstName,String lastName, String group, double averageMark){
        this.averageMark = averageMark;
        this.firstName = firstName;
        this.group = group;
        this.lastName = lastName;
    }
    int getScholarship(){
        if (averageMark==5){
            return 100;
        }else {
            return 80;
        }
    }
}
