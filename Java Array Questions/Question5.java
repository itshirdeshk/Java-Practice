// Question 5 : Java Program to sort the elements of an array in ascending order

public class Question5 {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
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