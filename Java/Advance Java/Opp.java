// class Pen {
//     String color;
//     String type;
//     public void write() {
//         System.out.println("Writing something");
//     }
//     public void printColor() {
//         System.out.println(this.color);
//     }

//     public void printType() {
//         System.out.println(this.type);
//     }
// }

// class Student {
//     String name;
//     int age;

//     public void printName() {
//         System.out.println(this.name);
//     }

//     public void printInfo() {
//         System.out.println(this.age);
//     }

//     // Student(String name, int age) {
//     //     // System.out.println("Constructor called!");
//     //     this.name = name;
//     //     this.age = age;
//     // }

//     Student(Student s2) {
//         this.name = s2.name;
//         this.age = s2.age;
//     }

//     Student() {

//     }
// }

// public class Opp {
//     public static void main(String args[]){
//         Pen pen1 = new Pen();
//         pen1.color = "blue";
//         pen1.type = "gel";
//         pen1.write();
//         pen1.printColor();
//         pen1.printType();

//         Pen pen2 = new Pen();
//         pen2.color = "black";
//         pen2.type = "ballpoint";
//         pen2.write();
//         pen2.printColor();
//         pen2.printType();

//         // Student s1 = new Student("Hannan", 21);
//         Student s1 = new Student();
//         s1.name = "Hannan";
//         s1.age = 21;
//         // s1.printName();
//         // s1.printInfo();

//         Student s2 = new Student(s1);
//         s2.printName();
//         s2.printInfo();
//     }
// }