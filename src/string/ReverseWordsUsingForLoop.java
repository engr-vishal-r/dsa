package string;

public class ReverseWordsUsingForLoop {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String input = "Hello World!";

        String [] words = input.split("\\s+");
        String result="";

        for(int i= words.length -1; i>=0;i--){
            result += words[i];
            if(i !=0){
                result +="";
            }

        }
        System.out.println("Reversed String " + result);
        long endTime = System.nanoTime();
        long timeTaken = endTime -startTime;
        System.out.println(timeTaken);

    }

}
