// Question 4 : Sunny Number Program in Java 

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int nextNum = num + 1;

        double squareRoot = Math.sqrt(nextNum);

        if (squareRoot - Math.floor(squareRoot) == 0) {
            System.out.println("The Number is Sunny Number");
        }
        else{
            System.out.println("The Number is not a Sunny Number");
        }

        sc.close();
    }
}