// class Shape {
//     String color;
// }

// class Triangle extends Shape {
// }

class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

// class EquilateralTriangle extends Triangle{
// public void area(int l, int h) {
// System.out.println(1 / 2 * l * h);
// }
// }

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class Inheritance {
    Triangle t1 = new Triangle();
    Circle c1 = new Circle();


    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        obj.t1.area(2, 8);
        obj.c1.area(2);
    }
}
