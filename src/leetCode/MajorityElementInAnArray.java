package leetCode;

public class MajorityElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {3,3,4,5,1};
		int ele = nums[0];
		int count=0;
		
		for(int num:nums) {
			if(count==0) {
				ele=num;
			}if(ele==num) {
				count++;
			}else {
				count--;
			}
		}
		int result = ele;
		System.out.println(result);
	}
}

