import java.util.Scanner;

// Question : Find the union of two Sets.

public class unionOfSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of Set 1 : ");
        int m = sc.nextInt();

        System.out.println("Enter the number of Elements of Set 2 : ");
        int n = sc.nextInt();

        int set1[] = new int[m];
        int set2[] = new int[n];
        int union[] = new int[m + n];

        System.out.println("Enter the Elements of Set 1 : ");
        for (int i = 0; i < m; i++) {
            set1[i] = sc.nextInt();
        }

        System.out.println("Enter the Elements of Set 2 : ");
        for (int i = 0; i < n; i++) {
            set2[i] = sc.nextInt();
        }

        int i;
        int j;
        int k = 0;

        for (i = 0; i < m; i++) {
            for (j = 0; j < k; j++) {
                if (union[j] == set1[i]) {
                    break;
                }
            }

            if (j == k) {
                union[k] = set1[i];
                k++;
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < k; j++) {
                if (union[j] == set2[i]) {
                    break;
                }
            }

            if (j == k) {
                union[k] = set2[i];
                k++;
            }
        }

        System.out.println("--------------");

        for (i = 0; i < k; i++) {
            System.out.println(union[i]);
        }
        sc.close();
    }
}