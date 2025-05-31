import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question = "What is the capital of France";
        String[] options = {"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"};
        int correctAnswer = 3;

        int userChoice = 0;

        while (userChoice != correctAnswer){
            System.out.println(question);
            for(String option: options) {
                System.out.println(option);
            }
            System.out.println("Enter the number of your choice: ");
            userChoice = sc.nextInt();
            
            if(userChoice == correctAnswer){
                System.out.println("Correct! Paris is the capital of France.");
            } else {
                System.out.println("Incorrect! Please try again.");
            }
        }

        sc.close();

        System.out.println("Maryam Siddique");
        System.out.println("BSCS-KC-012");
    }
}
