class Overload {
    void test(){
        System.out.println("No parameters");
    }

    void test(int a){
        System.out.println("a: " + a);
    }

    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }

    double test(double a){
        System.out.println("double a: " + a);
        return a * a;
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        double result;
        ob.test();
        ob.test(5);
        ob.test(3, 5);
        result = ob.test(16.45);
        System.out.println("Result of ob.text(16.45) is: " + result);
    }
}
