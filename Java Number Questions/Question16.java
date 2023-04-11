import java.util.Scanner;

// Question 16 : Evil Number Program in Java

public class Question16 {
    public static boolean checkNumber(int n) {

        // find the equivalence binary number using user defined convertToBinary()
        // method
        long binaryNumber = convertToBinary(n);

        // find total number of 1's in binary number
        int count = 0;

        // iterate each digit of binary number
        while (binaryNumber != 0) {

            // if the last digit of binary number is 1, increase the count value
            if (binaryNumber % 10 == 1)
                count++;

            // remove the last digit from the number
            binaryNumber = binaryNumber / 10;
        }

        // check whether the value of count is even or odd
        if (count % 2 == 0)
            return true; // return true when the value of count is even

        // return false if the value of the count is false
        return false;
    }

    private static long convertToBinary(int number) {
        long binaryNumber = 0;
        int rem = 0;
        int j = 1;
        while (number != 0) {
            rem = number % 2;
            binaryNumber += rem * j;
            number = number / 2;
            j = j * 10;
        }

        return binaryNumber; // return the binary equivalent number of the decimal number
    }

    public static void main(String[] args) {
        // declare variable in which the user entered value will be store
        int num = 0;

        // create scanner class object
        Scanner sc = new Scanner(System.in);

        // display custom message
        System.out.print("Enter a number : ");

        // get input from user
        num = sc.nextInt();

        // check whether the number is evil number or not
        if (checkNumber(num))
            System.out.println(num + " is an evil number");
        else
            System.out.println(num + " is not an evil number");

        sc.close();
    }
}
