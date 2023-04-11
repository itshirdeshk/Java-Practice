import java.util.Scanner;

// Question 2 : Java Program to divide a string in 'N' equal parts.

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String : ");
        String str = "aabbccdd";
        int len = str.length();

        System.out.println("Enter the size of Each Part : ");
        int n = sc.nextInt();

        int chars = len / n;

        String newStrArr[] = new String[n];

        int temp = 0;

        if (len % n != 0) {
            System.out.println("Sorry this String is not divided into " + n + " equal parts.");
        }

        else {
            for (int i = 0; i < len; i = i + chars) {
                newStrArr[temp] = str.substring(i, i + chars);
                temp++;
            }
        }

        System.out.println(n + " equal parts of the given string are : ");
        for (int i = 0; i < temp; i++) {
            System.out.println(newStrArr[i]);
        }

        sc.close();
    }
}