// import java.util.Scanner;

// import javax.sql.RowSet;
// import javax.swing.plaf.synth.SynthUI;

// Question 7 - Print the Pattern (Star Pattern)

// 1. Right Pascal's Triangle :

// public class Question7 {
//     public static void main(String[] args) {
//         System.out.println("Enter the Number of Rows : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         for (int i = n - 1; i > 0; i--) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

// 2. Left Pascal's Triangle : 

// public class Question7 {
//     public static void main(String[] args) {
//         System.out.println("Enter the Number of Rows : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = i; j < n; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 0; k < i; k++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }

//         for (int i = n; i > 0; i--) {
//             for (int k = i - 1; k < n; k++){
//                 System.out.print(" ");
//             }
//             for (int j = 1; j < i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//         sc.close();
//     }
// }

// 3. Sand Glass Pattern

// public class Question7 {
//     public static void main(String[] args) {
//         System.out.println("Enter the Number of Rows : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 0; i <= n - 1; i++) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = i; k <= n - 1; k++) {
//                 System.out.print("*" + " ");
//             }
//             System.out.println("");
//         }

//         for (int i = n - 1; i >= 0; i--) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = i; k <= n - 1; k++) {
//                 System.out.print("*" + " ");
//             }
//             System.out.println("");
//         }
//         sc.close();
//     }
// }

// 4. Alphabet Star Pattern

// public class Question7 {
//     public static void main(String[] args) {
//         System.out.println("Enter the Number of Rows : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 0; i <= n; i++) {
//             // Inner for loop for logic execution
//             for (int j = 0; j <= n / 2; j++) {
//                 // prints two vertical lines
//                 if ((j == 0 || j == n / 2) && i != 0 ||
//                 // print first line of alphabet
//                         i == 0 && j != n / 2 ||
//                         // prints middle line
//                         i == n / 2)
//                     System.out.print(" *");
//                 else
//                     System.out.print("  ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

// Triangle Star Pattern

// public class Question7 {
//     public static void main(String[] args) {
//         System.out.println("Enter the Number of Rows : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = i; j < n; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 if (k == 1 || i == n || k == (2 * i - 1)) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");
//         }
//         sc.close();
//     }
// }

// public class Question7 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows you want to print: ");
//         int rows = sc.nextInt();
//         for (int i = 1; i <= rows; i++) {
//             for (int j = rows; j > i; j--) {
//                 System.out.print(" ");
//             }
//             System.out.print("*");
//             for (int k = 1; k < 2 * (i - 1); k++) {
//                 System.out.print(" ");
//             }
//             if (i == 1) {
//                 System.out.println("");
//             } else {
//                 System.out.println("*");
//             }
//         }
//         for (int i = rows - 1; i >= 1; i--) {
//             for (int j = rows; j > i; j--) {
//                 System.out.print(" ");
//             }
//             System.out.print("*");
//             for (int k = 1; k < 2 * (i - 1); k++) {
//                 System.out.print(" ");
//             }
//             if (i == 1)
//                 System.out.println("");
//             else
//                 System.out.println("*");
//         }
//         sc.close();
//     }
// }

// Question 7 - Print the Patterns (Number Patterns)

// Pattern - 1

// public class Question7 {
//     public static void main(String[] args) {
//         System.out.println("Enter the Number of rows :");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }

// Pattern - 2

// public class Question7 {
//     public static void main(String[] args) {
//         System.out.println("Enter the Number of rows :");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int k = 1;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(k++ + " ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

// public class Question7 {
//     public static void main(String[] args) {
//         System.out.println("Enter the Number of rows :");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = i; j < n; j++) {
//                 System.out.print("  ");
//             }
//             for (int k = i; k > 0; k--) {
//                 System.out.print(k + " ");
//             }
//             for (int l = 2; l <= i; l++) {
//                 System.out.print(l + " ");
//             }
//             System.out.println();
//         }

//         for (int i = n - 1; i > 0; i--) {
//             for (int j = n; j > i; j--) {
//                 System.out.print("  ");
//             }
//             for(int k = i; k > 0; k--) {
//                 System.out.print(k + " ");
//             }
//             for(int l = 2; l <= i; l++) {
//                 System.out.print(l + " ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

// public class Question7 {
//     public static void main(String[] args) {
//         System.out.println("Enter the Number of rows :");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             if (i % 2 != 0) {
//                 for (int j = 1; j <= n; j++) {
//                     if (j % 2 != 0) {
//                         System.out.print("1 ");
//                     }
//                     else{
//                         System.out.print("0 ");
//                     }
//                 }
//                 System.out.println();
//             }
//             if(i % 2 == 0) {
//                 for(int j = 1; j <= n; j++) {
//                     if(j % 2 != 0) {
//                         System.out.print("0 ");
//                     }
//                     else{
//                         System.out.print("1 ");
//                     }
//                 }
//                 System.out.println();
//             }
//         }
//         sc.close();
//     }
// }

// public class Question7 {
//     public static void main(String[] args) {
//         System.out.println("Enter the Number of rows :");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = n; j > i; j--) {
//                 System.out.print("1");
//             }
//             for(int k = 1; k <= i; k++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

// public class Question7 {
//     public static void main(String[] args) {
//         System.out.println("Enter the Number of rows :");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             int num = i;
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num = (num + n) - j;
//             }
//             System.out.println();

//         }
//         sc.close();
//     }
// }

// Question 7 - Print the Pattern (Character Pattern)

// public class Question7 {
//     public static void main(String[] args) {
//         System.out.println("Enter the Number of rows :");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int letter = 65;

//         for (int i = 0; i <= n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print((char)(letter + j) + " ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }