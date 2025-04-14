package leetCode;

public class FindEvenOrOdd {
	public static void main(String[] args) {
		int [] nums = {50, 15, 9, 20, 30};
		
		for(int i=0; i<nums.length;i++) {
			if((nums[i]&1)==0) {
				System.out.println("Number is Even :" + nums[i] );
			}else {
				System.out.println("Number is Odd :" + nums[i] );
			}
		
		}
	}
}