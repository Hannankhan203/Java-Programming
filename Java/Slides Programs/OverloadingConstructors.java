class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class OverloadingConstructors {
    public static void main(String[] args) {
        Box box1 = new Box(20, 10, 15);
        Box box2 = new Box();
        Box cube1 = new Box(5);
        double vol;
        vol = box1.volume();
        System.out.println("Volume of box 1 is: " + vol);
        vol = box2.volume();
        System.out.println("Volume of box 2 is: " + vol);
        vol = cube1.volume();
        System.out.println("Volume of cube is: " + vol);
    }
}
