// public class FourthClass {
//     public static void main (String args[]) {
//         for (int count = 0; count < 10; count++) {
//             System.out.println("Hello Word");
//         }
//     }
// }

// public class FourthClass {
//     public static void main (String args[]) {
//         for (int count = 0; count < 11; count++) {
//             System.out.println(count);
//         }
//     }
// }



// public class FourthClass {
//     public static void main (String args[]) {
//         for (int count = 0; count < 11; count++) {
//             System.out.print(count + " ");
//         }
//     }
// }

// public class FourthClass {
//     public static void main (String args[]) {
//         int count = 0;
//         while (count < 11) {
//             System.out.print(count + " ");
//             count++;
//         }
//     }
// }

// public class FourthClass {
//     public static void main (String args[]) {
//         int count = 0;
//         do {
//             System.out.print(count + " ");
//             count++;
//         }
//         while (count < 11);
//     }
// }

// public class FourthClass {
//     public static void main (String args[]) {
//         int n = 10;
//         int sum = 0;
//         int natNum = 0;
//         for (int i = 1; i <= n; i++) {
//             sum = sum + i;
//             natNum = sum;
//         }
//         System.out.println(natNum);
// }
// }

import java.util.*;

public class FourthClass {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 0;
        for (int i = 1; i <= 10; i++){
            prod = n * i;
            System.out.println(prod);
        }
    }
}
