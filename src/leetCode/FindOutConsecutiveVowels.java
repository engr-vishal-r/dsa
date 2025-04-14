package leetCode;

public class FindOutConsecutiveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String toCheck = "COOMPUUTER";
        String vowels = "AEIOU";
        StringBuilder checked =new StringBuilder();

        // Loop through each character in the input string
        for (int i = 0; i < toCheck.length(); i++) {
            char currentChar = toCheck.charAt(i);
            // Check if the current character is not a vowel or the previous character is not a vowel
            if (vowels.indexOf(currentChar) == -1 || (i > 0 && vowels.indexOf(toCheck.charAt(i - 1)) == -1)) {                
                continue;
        }else {
        	// Append the character to the result
        	checked.append(currentChar);
        }
        }
        System.out.println(checked.toString());
    }
}
