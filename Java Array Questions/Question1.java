// Question 1 : Java Program to copy all elements of one array into another array.

public class Question1 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int copyTo[] = new int[10];

        for (int i = 0; i < 10; i++) {
            copyTo[i] = arr[i];
        }

        for(int i: copyTo){
            System.out.println(i);
        }
    }
}