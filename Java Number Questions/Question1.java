import java.util.Scanner;

// Question 1 - How to reverse a Number in Java

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println("The Reverse of the Entered Number is " + rev);

        sc.close();
    }
}