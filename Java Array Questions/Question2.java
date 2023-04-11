import java.util.Arrays;

// Question 2 : Program to find the frequency of each element in the array.

public class Question2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 4, 4, 6, 7, 8 };

        boolean visited[] = new boolean[arr.length];

        Arrays.fill(visited, false);

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == true) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " | " + count);
        }
    }
}
