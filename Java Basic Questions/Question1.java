// import java.util.Scanner;

// Question 1 - Fibonacci Series in Java without recusrion

// public class Question1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int first = 0;
//         int second = 1;
//         System.out.print(first + " " + second);

//         for (int i = 2; i < n; i++) {
//             int Series = first + second;
//             System.out.print(" " + Series);
//             first = second;
//             second = Series;
//         }
//         sc.close();
//     }
// }

// Question 1 : Fibonacci Series in Java using Recusrion

// public class Question1 {
//     static int first = 0;
//     static int second = 1;
//     static int Series = 0;

//     static void printFibonacci(int n) {
//         if (n > 0) {
//             Series = first + second;
//             first = second;
//             second = Series;
//             System.out.print(" " + Series);
//             printFibonacci(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         System.out.print(first + " " + second);
//         printFibonacci(n - 2);

//         sc.close();
//     }
// }