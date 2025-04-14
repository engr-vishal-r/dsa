package leetCode;

public class AddNumbersWithoutOperator {
	public static int add(int a, int b) {

		// TODO Auto-generated method stub
		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 7;
		int sum = add(num1, num2);
		System.out.println("Sum: " + sum);
	}
}