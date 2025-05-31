// public class FifthClass {
//     public static void main(String args[]) {
//         int n = 5;
//         int m = 6;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= m; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class FifthClass {
//     public static void main(String args[]) {
//         int n = 4;
//         int m = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= m; j++) {
//                 if(i ==1 || j == 1 || i == n || j ==m) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class FifthClass {
//     public static void main(String args[]) {
//         int n = 6;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class FifthClass {
//     public static void main(String args[]) {
//         int n = 6;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 6; j >= i; j--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class FifthClass {
//     public static void main(String args[]) {
//         int n = 6;
//         for (int i = 1; i <= n; i++) {
//             System.out.print(" ");
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class FifthClass {
//     public static void main(String args[]) {
//         int n = 6;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// public class FifthClass {
//     public static void main(String args[]) {
//         int n = 1;
//         for (int i = 6; i >= n; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class FifthClass {
//     public static void main(String args[]) {
//         int n = 6;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i + 1; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// public class FifthClass {
//     public static void main(String args[]) {
//         int n = 6;
//         int m = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(m + " ");
//                 m++;
//             }
//             System.out.println();
//         }
//     }
// }

public class FifthClass {
    public static void main(String args[]) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}