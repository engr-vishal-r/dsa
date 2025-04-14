package string;

public class ReverseStringUsingRecursive {

	public static void main(String[] args) {
        String input = "Hello, World!";
        long startTime = System.nanoTime();
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
        long endTime = System.nanoTime();
        long timeTaken = endTime -startTime;
        System.out.println(timeTaken);
    }

	public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character, return it as is
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        
        // Recursive case: reverse the substring excluding the first character,
        // then append the first character to the end of the reversed substring
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}