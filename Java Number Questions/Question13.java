import java.util.Scanner;

// Question 13 : Sphenic Number Program in Java

public class Question13 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int factors[] = new int[10000];

        int place = 0;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                factors[place] = i;
                // System.out.println(factors[place]);
                place++;
            }
        }

        int product = 1;
        int count = 0;

        while (count < 3) {
            for (int i = 0; i < place; i++) {
                if (isPrime(factors[i]) == true) {
                    product = product * factors[i];
                    count++;
                }
            }
        }

        // System.out.println(product + " - product");

        if (product == num) {
            System.out.println(num + " is a Sphenic Number");
        }

        else {
            System.out.println(num + " is not a Sphenic Number");
        }

        sc.close();
    }
}