package string;

public class PrintSubStrings {

	public static void main(String[] args) {
        char str[] = {'a', 'b', 'c', 'd'};
        
        System.out.println("Substrings:");
        //pick starting point
        for (int len = 1; len <= str.length; len++) {
            for (int start = 0; start <= str.length - len; start++) {
                int end = start + len;
                printSubstring(str, start, end);
            }
        }
    }

    public static void printSubstring(char[] str, int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(str[i]+ " ");
        }
        System.out.println();
    }
}