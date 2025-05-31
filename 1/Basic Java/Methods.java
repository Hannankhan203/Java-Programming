// import java.util.*;

// public class Methods {
//     public static int add(int a, int b) {
//         return a + b;
//     }

//     public static int sub(int a, int b) {
//         return a - b;
//     }

//     public static int mul(int a, int b) {
//         return a * b;
//     }

//     public static int div(int a, int b) {
//         return a / b;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number");
//         int a = sc.nextInt();
//         System.out.println("Enter second number");
//         int b = sc.nextInt();
//         System.out.println("Enter operator");
//         String op = sc.next();
//         if (op.equals("+")) {
//             add(a, b);
//         System.out.println(a + b);
//         } else if (op.equals("-")) {
//             sub(a, b);
//         System.out.println(a - b);
//         } else if (op.equals("*")) {
//             mul(a, b);
//         System.out.println(a * b);
//         } else if (op.equals("/")) {
//             div(a, b);
//         System.out.println(a / b);
//         }
//         sc.close();
//     }
// }

import java.util.*;

public class Methods {
    public static void Fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        // Fibonacci(n);
        sc.close();
    }
}