import java.util.Scanner;

class Box {
    double width;
    double height;
    double depth;
}

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        Scanner sc = new Scanner(System.in);
        double volume;
        System.out.println("Enter width, height and depth to find the volume of the box.");
        box.width = sc.nextDouble();
        box.height = sc.nextDouble();
        box.depth = sc.nextDouble();
        volume = box.width * box.height * box.depth;
        System.out.println("The volume of the box is: " + volume);
        sc.close();
    }
}