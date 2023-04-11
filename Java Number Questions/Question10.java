import java.util.Scanner;

// Question 10 : ATM Program in Java

public class Question10 {
    public static void main(String[] args) {
        
        int balance = 100000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Press 1 for Withdrawal");
            System.out.println("Press 2 for Deposit");
            System.out.println("Press 3 for Checking Account Balance");
            System.out.println("Press 4 for Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount you want to Withdrawal : ");
                    withdraw = sc.nextInt();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;

                        System.out.println("Transaction Successful...");
                        System.out.println("Your New Balance is " + balance);
                    }

                    else {
                        System.out.println("Insufficient Balance...");
                    }
                    System.out.println("");
                    break;
                
                case 2:
                    System.out.print("Enter the amount you want to Deposit : ");
                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("Transaction Successful...");
                    System.out.println("Your New Balance is " + balance);
                    System.out.println("");
                    break;
                
                case 3:
                    System.out.println("Your Account Balace is : " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}