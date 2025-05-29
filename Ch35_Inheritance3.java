class MultiCalculator35 extends Calculator34 {
	public void multi() {
		System.out.println("multi:" + (this.left * this.right));
	}
}

class DiviCalculator35 extends MultiCalculator35 {
	public void divi() {
		System.out.println("divi:" + (this.left / this.right));
	}
}

public class Ch35_Inheritance3 {
	public static void main(String[] args) {
		MultiCalculator35 c1 = new MultiCalculator35();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.multi();


		DiviCalculator35 c2 = new DiviCalculator35();
		c2.setOperands(20, 40);
		c2.sum();
		c2.avg();
		c2.multi();
		c2.divi();
	}
}
