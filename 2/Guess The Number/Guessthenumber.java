import java.util.Scanner;

public class Guessthenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = (int) (Math.random() * 100);
        int userNum = 0;
        do {
            System.out.println("Guess the number (1 - 100)");
            userNum = sc.nextInt();
            if (userNum == myNum) {
                System.out.println("Correct Guess");
                break;
            } else if (userNum > myNum) {
                System.out.println("Number is too large");
            } else {
                System.out.println("Number is too small");
            }
        } while (userNum >= 0);

        System.out.print("The number was: ");
        System.out.print(myNum);
    }
}