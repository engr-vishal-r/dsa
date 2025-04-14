package leetCode;

public class InvertedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberr = 10;
		int i, j;

		// Outer loop handle the number of rows
		for (i = numberr; i >= 1; i--) {

			// Inner loop print space
			for (j = i; j < numberr; j++) {
				System.out.print(" ");
			}

			// Inner loop print star
			for (j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}

			// Ending line after each row
			System.out.println("");
		}
	}

}
