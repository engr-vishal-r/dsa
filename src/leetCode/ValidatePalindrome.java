package leetCode;

public class ValidatePalindrome {

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(right--) != s.charAt(left++))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String toCheck = "noon";

        if(isPalindrome(toCheck)){
            System.out.println("Given String " + toCheck + " is a Palindrome");
        }else {
            System.out.println("Given String " + toCheck + " is not a Palindrome");
        }
    }
}