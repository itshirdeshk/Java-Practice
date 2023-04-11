import java.util.Scanner;

// Question 3 : Palindrome Program in Java

public class Question3 {
    public static void main(String[] args) {
        
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;

        int rev = 0;

        while(n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10; 
        }

        if (num == rev) {
            System.out.println(num + " is a Palindrome Number");
        }
        else{
            System.out.println(num + " is not a Palindrome Number");
        }
        sc.close();
    }
}
