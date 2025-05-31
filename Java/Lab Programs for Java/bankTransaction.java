import java.util.Scanner;

public class bankTransaction {
    public static void main(String[] args) {
        double currentBalance = 12000.00;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        double withdrawelAmount = sc.nextDouble();

        if(withdrawelAmount <= currentBalance) {
            System.err.println("Amount is available");
        } else {
            System.out.println("Amount is not available");
        }

        sc.close();

        System.out.println("Maryam Siddique");
        System.out.println("BSCS-KC-012");
    }
}
