package leetCode;

public class SwapNumWithoutIncreasingMemory {

	public static void main(String args[]) {
		
	int a = 50; //(binary 0101)
	int b = 100; //(binary 0111)
	
	System.out.println("before swapping" + a + " " + b);
	
	a = a^b;
	b= b^a; 
	a= a^b;	
	System.out.println("after swapping" + a + " " + b);
}

}

/**
 * 
   50 ->  0101
   100 -> 0111
          0010

0111
0010
0101

0101
0010
0111
 * 
 */
