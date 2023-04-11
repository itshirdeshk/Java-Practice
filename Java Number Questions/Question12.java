import java.util.Scanner;

// Question 12 : Emirp Number Program in Java 

public class Question12 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isPrime(num) == true) {
            int reverse = reverse(num);
            if (isPrime(reverse) == true) {
                System.out.println(num + " is a Emirp Number");
            }

            else {
                System.out.println(num + " is not a Emirp Number");
            }
        }

        else{
            System.out.println(num + " is not a Emirp Number");
        }

        sc.close();
    }
}