import java.util.Scanner;

// Question 18 : Bouncy Number Program in Java

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        if (isIncreasing(num) || isDecreasing(num) || num <= 100) {
            System.out.println(num + " is not a Bouncy Number");
        }

        else {
            System.out.println(num + " is a Bouncy Number");
        }

        sc.close();
    }

    public static boolean isIncreasing(int num) {
        String str = Integer.toString(num);
        char digit;
        boolean flag = true;
        for (int i = 0; i < str.length() - 1; i++) {
            digit = str.charAt(i);
            if (digit > str.charAt(i + 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isDecreasing(int num) {
        String str = Integer.toString(num);
        char digit;
        boolean flag = true;
        for (int i = 0; i < str.length() - 1; i++) {
            digit = str.charAt(i);
            if (digit < str.charAt(i + 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}