// import java.util.Scanner;

// // Question 4 : Factorial Program in Java without recursion

// public class Question4 {
//     public static void main(String[] args) {
//         System.out.println("Enter the Number : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int fact = 1;

//         for(int i = 2; i <= n; i++) {
//             fact = fact * i;
//         }

//         System.out.println("The Factorial of the Number " + n + " is " + fact);
//         sc.close();
//     }
// }

// import java.util.Scanner;

// // Question 4 : Factorial Program in Java with recursion

// public class Question4 {

//     static int fact(int n) {
//         if (n == 0) {
//             return 0;
//         }
//         else if(n == 1){
//             return 1;
//         }
//         else {
//             return n * fact(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println("Enter the Number : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int fact = fact(n);

//         System.out.println("The Factorial of the Number " + n + " is " + fact);
//         sc.close();
//     }
// }


