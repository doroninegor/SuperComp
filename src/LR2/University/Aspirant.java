package LR2.University;

public class Aspirant extends Student {
    String ScientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String ScientificWork) {
        super(firstName, lastName, group, averageMark);
        this.ScientificWork = ScientificWork;
    }

        public int getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }


    }
}

