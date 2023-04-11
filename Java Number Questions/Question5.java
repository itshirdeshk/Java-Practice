import java.util.Scanner;

// Question 5 : Tech Number Program in Java

public class Question5 {
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int digits = 0;
        int temp = num;

        while (num > 0) {
            digits++;
            num = num / 10;
        }

        if (digits % 2 == 0) {
            int firstHalf = temp / (int)Math.pow(10, digits / 2);
            int secondHalf = temp % (int)Math.pow(10, digits / 2);

            int sumOfHalfs = firstHalf + secondHalf;

            int squareOfSumOfHalfs = sumOfHalfs * sumOfHalfs;

            if (squareOfSumOfHalfs == temp) {
                System.out.println("The Number is Tech Number");
            }

            else{
                System.out.println("The Number is not a Tech Number");
            }
        }

        else{
            System.out.println("The Number is not a Tech Number");
        }

        sc.close();
    }
}
