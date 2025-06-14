package leetCode;

public class AddDigits {

	public static void main(String[] args) {
		//Add digits till single digit output
		
		int num =5877;
		// Loop until the sum becomes a single digit
        while (num > 9) {
            int sum = 0;
            // Compute the sum of digits
            while (num > 0) {
                sum += (num % 10);
                num /= 10;
            }
            // Update the number with the new sum
            num = sum;
        }
        
        // Print the single digit sum
        System.out.println(num);
    }
}
