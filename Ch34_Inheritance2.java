import org.w3c.dom.ls.LSOutput;

class Calculator34 {
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

// SubCalculator34 -> Calculator34
class SubCalculator34 extends Calculator34 {
	public void sub() {
		System.out.println("sub:" + (this.left - this.right));
	}
}

public class Ch34_Inheritance2 {
	public static void main(String[] args) {

		SubCalculator34 c1 = new SubCalculator34();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.sub();
	}
}
