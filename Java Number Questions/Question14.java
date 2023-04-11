import java.util.Scanner;

// Question 14 : Buzz Number Program in java

public class Question14 {
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int lastDigit = num % 10;
        
        if (lastDigit == 7) {
            System.out.println(num + " is a Buzz Number");
        }

        else if (num % 7 == 0) {
            System.out.println(num + " is a Buzz Number");
        }

        else if (lastDigit == 7 || num % 7 == 0) {
            System.out.println(num + " is a Buzz Number");
        }

        else {
            System.out.println(num + " is not a Buzz Number");
        }

        sc.close();
    }
}
