// Question 5 : Java Program to determine whether a given string is palindrome.

public class Question5 {
    public static void main(String[] args) {
        String oldstring = "Kayak";
        boolean flag = true;

        String str = oldstring.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println(oldstring + " is Palindrome.");
        }

        else {
            System.out.println(oldstring + "is not Palindrome.");
        }
    }
}