// Question 1
// import java.util.*;

// public class JavaExercise1 {
//     public static int calcAvg (int a, int b, int c) {
//         int sum = a + b + c;
//         int avg = sum / 3;
//         return avg;
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         Scanner sc2 = new Scanner(System.in);
//         Scanner sc3 = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc2.nextInt();
//         int c = sc3.nextInt();
//         int avg = calcAvg(a, b, c);
//         System.out.println(avg);
//     }
// }


// Question 2
// import java.util.*;

// public class JavaExercise1 {
//     public static int sumOfOdd (int a) {
//         int sum = 0;
//         for ( int i = 1; i <= a; i++) {
//             if (i % 2 != 0) {
//                 sum += i;
//             }
//         }
//         return sum;
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int sum = sumOfOdd(a);
//         System.out.println(sum);
//     }
// }


// Question 3
// import java.util.*;

// public class JavaExercise1 {
//     public static void greaterNum (int a, int b) {
//         if (a > b) {
//             System.out.println("a is greater than b");
//         } else if (a < b) {
//             System.out.println("b is greater than a");
//         }
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         Scanner sc2 = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc2.nextInt();
//         greaterNum(a, b);
//     }
// }


// Question 4
// import java.util.*;

// public class JavaExercise1 {
//     public static double circumference (int r) {
//         double C = 2 * 3.14 * r;
//         return C;
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         double C = circumference(r);
//         System.out.println(C);
//     }
// }


// Question 5
// import java.util.*;

// public class JavaExercise1 {
//     public static void eligibleAge (int age) {
//         if (age > 18) {
//             System.out.println("You are eligible to vote!");;
//         } else {
//             System.out.println("You are not eligible to vote!");
//         }
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         eligibleAge(age);
//     }
// }




// Question 6
// public class JavaExercise1 {
//     public static void main (String args[]) {
//         int i = 0;
//         do {
//             System.out.println("Infinit loop!");
//             i++;
//         } while (i >= 0);
//     }
// }



// Question 7
// import java.util.Scanner;

// public class JavaExercise1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         int positiveCount = 0;
//         int negativeCount = 0;
//         int zeroCount = 0;
//         char choice;

//         do {
//             System.out.print("Enter a number: ");
//             int number = scanner.nextInt();

//             // Count positive, negative, or zero
//             if (number > 0) {
//                 positiveCount++;
//             } else if (number < 0) {
//                 negativeCount++;
//             } else {
//                 zeroCount++;
//             }

//             // Ask the user if they want to enter another number
//             System.out.print("Do you want to enter another number? (y/n): ");
//             choice = scanner.next().charAt(0);
//         } while (choice == 'y' || choice == 'Y');

//         // Display the counts
//         System.out.println("Positive numbers: " + positiveCount);
//         System.out.println("Negative numbers: " + negativeCount);
//         System.out.println("Zeros: " + zeroCount);
//     }
// }


// Question 8
// import java.util.Scanner;

// public class JavaExercise1 {
//     // Function to calculate x raised to the power n
//     public static double power(double x, int n) {
//         return Math.pow(x, n);
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input the base number x
//         System.out.print("Enter the base number (x): ");
//         double x = scanner.nextDouble();

//         // Input the exponent n
//         System.out.print("Enter the exponent (n): ");
//         int n = scanner.nextInt();

//         // Call the power function and display the result
//         double result = power(x, n);
//         System.out.println(x + " raised to the power " + n + " is: " + result);
//     }
// }

// Question 9
// import java.util.Scanner;

// public class JavaExercise1 {
//     // Function to calculate GCD of two numbers using Euclidean algorithm
//     public static int gcd(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input two numbers
//         System.out.print("Enter the first number: ");
//         int num1 = scanner.nextInt();

//         System.out.print("Enter the second number: ");
//         int num2 = scanner.nextInt();

//         // Call the gcd function and display the result
//         int result = gcd(num1, num2);
//         System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
//     }
// }


// Question 10
import java.util.Scanner;

public class JavaExercise1 {
    // Function to print Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            
            // Calculate the next number in the series
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // Move to the next line after printing the series
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms for Fibonacci series
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Print Fibonacci series
        if (n > 0) {
            printFibonacci(n);
        } else {
            System.out.println("Please enter a positive number.");
        }
    }
}
