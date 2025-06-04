class Calculator42 {
	private int x, y;

	public void setOperands(int x, int y) {
		this.x = x;
		this.y = y;
	}

//	내부적으로 사용하는 부분은 private으로
	private int sum() {
		return this.x + this.y;
	}

	public void sumDeco() {
		System.out.println(this.x + " + " + this.y + " = " + (this.x + this.y));
	}

	public void minusDeco() {
		System.out.println(this.x + " - " + this.y + " = " + (this.x - this.y));
	}
}


public class Ch42_AccessModifier2 {
	public static void main(String[] args) {
		Calculator42 c1 = new Calculator42();
		c1.setOperands(10, 20);
		c1.sumDeco();
		c1.minusDeco();
	}
}
