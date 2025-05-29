class Calculator37 {
	int left, right;

	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println("sum:" + (this.left + this.right));
	}

	public void avg() {
		System.out.println("avg:" + (this.left + this.right) / 2);
	}
}

class SubCalculator37 extends Calculator37 {
//	method overriding
	public void sum() {
		System.out.println(this.left + " + " + this.right + " = " + (this.left + this.right));
	}

	public void sub() {
		System.out.println("sub:" + (this.left - this.right));
	}
}


public class Ch37_Overriding1 {
	public static void main(String[] args) {
		SubCalculator37 c1 = new SubCalculator37();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.sub();
	}
}
