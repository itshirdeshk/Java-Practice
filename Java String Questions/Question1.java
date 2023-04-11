// Question 1 : Java Program to count the total number of characters in a string.

public class Question1 {
    public static void main(String[] args) {
        String str = "The Best of Both Worlds";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println(count);
    }
}