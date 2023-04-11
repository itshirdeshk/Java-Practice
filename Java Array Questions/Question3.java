// Question 3 : Program to left rotate the elements of an array

public class Question3 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int n = 1;

        int i;

        int first = arr[0];

        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + n];
        }

        arr[i] = first; 

        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    } 
}