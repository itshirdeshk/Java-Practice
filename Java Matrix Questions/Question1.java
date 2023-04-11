import java.util.Scanner;

// Question 1 : Java Program to display the lower triangular matrix.

public class Question1 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j > i) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}  