import java.util.Scanner;

// Question 6 : Fascinating Number Program in Java

public class Question6 {
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int digits = 0;

        while (num > 0) {
            digits++;
            num = num / 10;
        }

        if (digits >= 3) {
            int n2 = temp * 2;
            int n3 = temp * 3;

            String number = temp + "" + n2 + n3;

            boolean found = true;

            for (char c = '1'; c <= '9'; c++) {
                int count = 0;
                for (int i = 0; i < number.length(); i++) {
                    char ch = number.charAt(i);

                    if (ch == c) {
                        count++;
                    }
                }
                if (count > 1 || count == 0) {
                    found = false;
                    break;
                }
            }

            if (found) {
                System.out.println(temp + " is a Fascinating Number");
            }

            else {
                System.out.println(temp + " is not a Fascinating Number");
            }
        }

        else {
            System.out.println(temp + " is not a Fascinating Number");
        }
        sc.close();
    }
}
