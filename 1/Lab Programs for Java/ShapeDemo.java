import java.util.Scanner;

interface IShape {
    void SName();
    void ShArea();
}

class Shape implements IShape{
    private String shapeName;

    @Override
    public void SName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the shape (Circle, Square, Rectangle, Triangle)");
        shapeName = sc.nextLine().trim();
    }

    @Override
    public void ShArea(){
        Scanner sc = new Scanner(System.in);
        double area = 0;

        if("Circle".equalsIgnoreCase(shapeName)){
            System.out.print("Enter the radius of the circle: ");
            double radius = sc.nextDouble();
            area = Math.PI * radius * radius;
        } else if ("Square".equalsIgnoreCase(shapeName)){
            System.out.print("Enter the side length of the square: ");
            double side = sc.nextDouble();
            area = side * side;
        } else if ("Rectangle".equalsIgnoreCase(shapeName)){
            System.out.print("Enter the length of the rectangle: ");
            double length = sc.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = sc.nextDouble();
            area = length * width;
        } else if("Triangle".equalsIgnoreCase(shapeName)){
            System.out.println("Enter the base of the triangle: ");
            double base = sc.nextDouble();
            System.out.println("Enter the height of the triangle: ");
            double height = sc.nextDouble();
            area = 0.5 * base * height;
        } else {
            System.out.println("Invalid shape name entered.");
            return;
        }

        System.out.println("The area of the " + shapeName + " is: " +  area);

    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.SName();
        shape.ShArea();


        System.out.println("Maryam Siddique");
        System.out.println("BSCS-KC-012");
    }
}
