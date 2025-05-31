import java.util.*;

// public class ThirdClass {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if (age > 18) {
//             System.out.print("Adult");
//         } else {
//             System.out.println("Not adult");
//         }
//     }
// }


// public class ThirdClass {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         if (num % 2 == 0) {
//             System.out.println("Even");
//         } else {
//             System.out.println("Odd");
//         }
//     }
// }


// public class ThirdClass {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         Scanner sc2 = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc2.nextInt();

//         if (a == b) {
//             System.out.println("a and b are equal");
//         } else if (a > b) {
//             System.out.println("a is greater than b");
//         } else {
//             System.out.println("b is greater than a");
//         }
//     }
// }

// public class ThirdClass {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         if (button == 1) {
//             System.out.println("Hello");
//         } else if (button == 2) {
//             System.out.println("Salam");
//         } else if (button == 3) {
//             System.out.println("Hola");
//         } else {
//             System.out.println("Invalid button");
//         }
//     }
// }


public class ThirdClass {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Salam");
            break;
            case 3 : System.out.println("Hola");
            break;
            default : System.out.println("Invalid button");
        }
    }
}