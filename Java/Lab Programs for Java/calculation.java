import java.util.Scanner;

public class calculation {
    private int a;
    private int b;

    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public void setValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number (a): ");
        a = sc.nextInt();
        System.out.println("Enter the second number (b): ");
        b = sc.nextInt();

        sc.close();
    }

    public static void main(String[] args) {
        calculation calc = new calculation();
        calc.setValues();
        System.out.println("Addition result: " + calc.add());
        System.out.println("Subtraction result: " + calc.subtract());

        System.out.println("Maryam Siddique");
        System.out.println("BSCS-KC-012");
    }
}
