// My name is Abdul Hannan Khan
class OverloadDemo {
    void test () {
    }
    void test (int a) {
        System.out.println("a: " + a);
    }
    void test (int a, int b) {
        System.out.println("a and b: " + a + "" + b);
    }
    double test (double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

public class OverLoad {
    public static void main (String args[]) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        ob.test(5);
        ob.test(5, 10);
        result = ob.test(7.5);
       System.out.println("Result of ob.test(7.5)" + result );
    }
}