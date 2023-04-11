import java.util.Scanner;

// Question 11 : Autobiographical Number Program in Java

public class Question11 {
    public static void main(String[] args) {
        System.out.println("Enter the Number you want to check : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);

        int n = num;

        String str = String.valueOf(num);

        int digitArray[] = new int[str.length()];

        for (int i = str.length() - 1 ; i >= 0; i--) {
            digitArray[i] = n % 10;
            n = n / 10;
        }

        boolean flag = true;

        for (int i = 0; i < digitArray.length; i++) {
            int count = 0;
            for (int j = 0; j < digitArray.length; j++) {
                if (i == digitArray[j]) {
                    count++;
                }
            }
            if (count != digitArray[i]) {
                flag = false;
                break;
            }            
        }

        if (flag == true) {
            System.out.println(num + " is a Autobiographical Number");
        }

        else {
            System.out.println(num + " is not a Autobiographical Number");
        }
        sc.close();
    }
}
