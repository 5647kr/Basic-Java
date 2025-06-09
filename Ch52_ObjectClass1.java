// toString

class Calculator52 {
	int x, y;

	public void setOperands(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void sum() {
		System.out.println(this.x + this.y);
	}

	public void avg() {
		System.out.println((this.x + this.y) / 2);
	}

	public String toString() {
		return "x: "+ this.x+", y: " + this.y;
	}
}

public class Ch52_ObjectClass1 {
	public static void main(String[] args) {
		Calculator52 c1 = new Calculator52();
		c1.setOperands(10, 20);
		System.out.println(c1);
		System.out.println(c1.toString());
	}
}
