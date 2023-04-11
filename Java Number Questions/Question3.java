import java.util.Scanner;

// Question 3 : Peterson Number Program in Java

public class Question3 {

    static int fact(int num) {
        if (num == 0) {
            return 1;
        }
        if (num == 1) {
            return 1;
        }
        else {
            return fact(num - 1) * num;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;

        int sumOfFact = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            sumOfFact = sumOfFact + fact(lastDigit);
            num = num / 10;
        }

        if (temp == sumOfFact) {
            System.out.println("The number is Peterson Number");
        }

        else {
            System.out.println("The numebr is not Peterson Number");
        }

        sc.close();
    }
}