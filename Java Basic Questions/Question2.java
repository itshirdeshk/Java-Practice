import java.util.Scanner;

// Question 2 - Prime Number in Java 

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = 0, flag = 0;
        m = n / 2;

        if (n == 0 || n == 1) {
            System.out.println(n + " is not a Prime Number");
        }
        else {
            for(int i = 2; i <= m; i++){
                if (n % i == 0){
                    System.out.println(n + " is not a Prime Number ");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println(n + " is a Prime Number");
            }
        }
        sc.close();
    }
}
