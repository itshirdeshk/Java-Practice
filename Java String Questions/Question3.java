// Question 3 : Java Program to find all subsets of a string.

public class Question3 {
    public static void main(String[] args) {
        String str = "Fun";

        int temp = 0;
        int len = str.length();
        String newStr[] = new String[(len * (len + 1)) / 2];

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                newStr[temp] = str.substring(i, j + 1);
                temp++;
            }
        }

        for (int i = 0; i < newStr.length; i++) {
            System.out.println(newStr[i]);
        }
    }
}
