class Calculator38 {
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

class SubCalculator38 extends Calculator38 {

//	1. 부모의 리턴타입과 자식의 리턴타입이 같아야 한다.
//	public int avg() { // error
//		return (this.left + this.right) / 2;
//	}

	public void sub() {
		System.out.println("sub:" + (this.left - this.right));
	}
}


public class Ch38_Overriding2 {
	public static void main(String[] args) {
		SubCalculator37 c1 = new SubCalculator37();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.sub();
	}
}
