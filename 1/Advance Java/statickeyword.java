class Student {
    String name;
    static String school;
    public static void newSchool() {
        school = "Stanmore O Levels";
    }
}

public class statickeyword {
    public static void main(String[] args) {
        Student.school = "Stanmore";
        Student s1 = new Student();
        s1.name = "Hannan";
        System.out.println(s1.school);
    }
}
