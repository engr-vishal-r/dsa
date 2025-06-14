package leetCode;

public class CallByValueCorrect {

	int data = 50;

	void change(CallByValueCorrect op) {
		op.data = op.data + 100;// changes will be in the instance variable
	}

	public static void main(String args[]) {
		CallByValueCorrect op = new CallByValueCorrect();

		System.out.println("before change " + op.data);
		op.change(op);// passing object
		System.out.println("after change " + op.data);

	}
}
