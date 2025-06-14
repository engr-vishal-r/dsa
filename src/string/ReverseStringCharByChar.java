package string;

public class ReverseStringCharByChar {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String input = "Hello, world!";
        String result="";

        for(int i= input.length() -1; i>=0;i--){
            result += input.charAt(i);

        }
        System.out.println("Reversed String " + result);
        long endTime = System.nanoTime();
        long timeTaken = endTime -startTime;
        System.out.println(timeTaken);

    }

}
