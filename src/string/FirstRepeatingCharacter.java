package string;

public class FirstRepeatingCharacter {

    public static void main(String[] args) {
        String str = "hello";
        int[] count = new int[256];
        Character result =null;
        for(int i=0; i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0; i< str.length();i++){
            if(count[str.charAt(i)] >1){
                result = str.charAt(i);
                break;
            }
        }
        System.out.println("First Repeating character :" + (result != null ? result : "none"));

    }
}
