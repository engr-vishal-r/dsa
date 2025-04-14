package leetCode;

public class BitwiseANDNumbersRange {

	public int shiftCounter(int left, int right) {
		int shiftCount = 0;
		while (left < right) {
			left >>= 1;
			right >>= 1;
			shiftCount++;

		}
		return left << shiftCount;

	}

	public static void main(String args[]) {
		int left = 5;
		int right = 7;
		BitwiseANDNumbersRange bo = new BitwiseANDNumbersRange();
		int result= bo.shiftCounter(left,right);
		System.out.println(result);
	}

}
