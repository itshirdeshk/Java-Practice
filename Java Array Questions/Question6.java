// Question 6 : Java Program to sort the elements of an array in descending order

public class Question6 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}