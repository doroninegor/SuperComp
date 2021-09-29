package LR2.University;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Михаил", "Швехгеймер", "БАП1801", 5);
        Student student2 = new Student("Басан", "Убушуев", "БСУ1801",4);
        Aspirant aspirant1 = new Aspirant("Василий","Пупкин","Исуиа", 4.5, "Робототехника");
        Aspirant aspirant2 = new Aspirant("Дмитрий", "Хадзугов", "ИБ", 5, "Защита связи");
        Student[] students = {student1, student2, aspirant1, aspirant2};
        for (int i =0; i<students.length; i++){
            System.out.println(students[i].getScholarship());
        }
    }
}
