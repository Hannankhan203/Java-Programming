class Student {
    protected String name;
    protected int rollNumber;

    public void setStudentDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Marks extends Student {
    protected int[] marks;
    protected int numberOfSubjects;

    public void setMarks(int[] marks) {
        this.marks = marks;
        this.numberOfSubjects = marks.length;
    }

    public void displayMarks() {
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

public class Marksheet extends Marks {
    public void calculatePercentageAndAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = (double) total / numberOfSubjects;
        double percentage = (double) total / (numberOfSubjects * 100) * 100;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
    }

    public void generateMarksheet(){
        displayStudentDetails();
        displayMarks();
        calculatePercentageAndAverage();
    }

    public static void main(String[] args) {
        Marksheet marksheet = new Marksheet();
        marksheet.setStudentDetails("Abdul Hannan Khan", 9);

        int[] subjectMarks = {94, 92, 93, 95, 98};
        marksheet.setMarks(subjectMarks);

        System.out.println("Marksheet: ");
        marksheet.generateMarksheet();

        System.out.println("Abdul Hannan Khan");
        System.out.println("BSCS-KC-009");
    }
}
