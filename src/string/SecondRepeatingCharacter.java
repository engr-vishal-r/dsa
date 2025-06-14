package string;

public class SecondRepeatingCharacter {
    public static void main(String[] args) {
        String str = "helloww";
        int[] count = new int[256];
        Character result=null;

        int found=0;

        for(int i=0; i<str.length();i++){
            count[str.charAt(i)]++;
        }

        for(int i=0; i< str.length();i++){
            if(count[str.charAt(i)] >1){
                found++;
                if(found==2) {
                    result = str.charAt(i);
                    break;
                }
                count[str.charAt(i)] =0;
            }
        }
        System.out.println("First Repeating character :" + (result != null ? result : "none"));

    }
}