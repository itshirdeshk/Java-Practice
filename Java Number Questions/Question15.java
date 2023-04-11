import java.util.Scanner;

// Question 15 : Duck Number Program in Java

public class Question15 {
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;

        boolean flag = true;

        while (num >= 0) {
            if (num % 10 == 0) {
                flag = true;
            }
            else {
                flag = false;
            }
            num = num / 10;
        }

        if (flag == true) {
            System.out.println(temp + " is a Duck Number");
        }

        else {
            System.out.println(temp + " is not a Duck Number");
        }

        sc.close();
    }
}