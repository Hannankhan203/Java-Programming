class Calculator {
    int add(int a, int b){
        return a + b;
    }

    int add (int a, int b, int c){
        return a + b + c;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two numbers: " + calc.add(3, 2));
        System.out.println("Sum of three numbers: " + calc.add(3, 2, 5));
    }
}
