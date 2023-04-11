import java.util.Scanner;

// Question 19 : Mystery Number in Java

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        // int temp = num;

        for (int i = 1; i <= num / 2; i++) {
            int sum = 0;
            int temp = i;
            while (i > 0) {
                int rem = i % 10;
                sum = sum * 10 + rem;
                i = i / 10;
            }

            if (temp + sum == num) {
                System.out.println(temp + " " + sum);
                System.out.println(num + " is a Mystery Number");
            }
        }
        System.out.println(num + " is not a Mystery Number");

        sc.close();
    }
}
