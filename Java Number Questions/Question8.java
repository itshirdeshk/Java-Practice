import java.util.Scanner;

// Question 8 : Neon Number Program in Java 

public class Question8 {
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        int sum = 0;
        
        int square = num * num;
        while (square > 0) {
            int rem = square % 10;
            sum = sum + rem;
            square = square / 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Neon Number");
        }
        
        else {
            System.out.println(num + " is not a Neon Number");
        }
        sc.close();
    }
}