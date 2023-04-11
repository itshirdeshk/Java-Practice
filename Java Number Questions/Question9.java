import java.util.Scanner;

// Question 9 : Spy Number Program in Java

public class Question9 {
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        int sum = 0;
        int product = 1;
        int temp = num;      
        
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            product = product * rem;
            num = num / 10;
        }

        if (sum == product) {
            System.out.println(temp + " is a Spy Number");
        }
        
        else {
            System.out.println(temp + " is not a Spy Number");
        }
        sc.close();
    }
}