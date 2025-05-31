// import java.util.*;

// public class SeventClass {
//     public static void printMyName (String name) {
//         System.out.println(name);
//         return;
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         printMyName(name);
//     }
// }


// import java.util.*;

// public class SeventClass {
//     public static int addingTwoNum (int a, int b) {
//         int sum = a + b;
//         return sum;
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         Scanner sc2 = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc2.nextInt();
//         int sum = addingTwoNum(a, b);
//         System.out.println(sum);
//     }
// }

// import java.util.*;

// public class SeventClass {
//     public static int multiplyingTwoNum (int a, int b) {
//         int prod = a * b;
//         return prod;
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         Scanner sc2 = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc2.nextInt();
//         int prod = multiplyingTwoNum(a, b);
//         System.out.println(prod);
//     }
// }

import java.util.*;

public class SeventClass {
    public static void printFactorial (int n) {
        if ( n < 0) {
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}



