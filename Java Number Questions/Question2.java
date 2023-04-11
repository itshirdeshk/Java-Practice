import java.util.Scanner;

// Question 2 - Automorphic Number Program in Java

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int square = num * num;

        int flag = 0;

        while (num != 0) {
            int lastDigitofNum = num % 10;
            num = num / 10;

            int lastDigitOfSquare = square % 10;
            square = square / 10;

            if (lastDigitofNum == lastDigitOfSquare) {
                flag = 1;
            }
            else {
                flag = 0;
            }
        }

        if (flag == 1) {
            System.out.println("The Number is Automorphic");
        }

        else {
            System.out.println("The Number is not Automorphic");
        }

        sc.close();
    }
}