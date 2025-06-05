// Final
// 상속 및 변경을 금지하는 규제이다.

// Final Field
class Calculator44 {
	static final double PI = 3.14;
	int x, y;

	public void setOperand(int x, int y) {
		this.x = x;
		this.y = y;
//		Calculator44.PI = 6; error
//		위에서 PI를 final로 고정하였기 때문에 나중에 변경할 수 없다.
	}

	public void sum() {
		System.out.println("sum: " + (this.x + this.y));
	}

	public void avg() {
		System.out.println("avg: " + (this.x + this.y) / 2);
	}

}



public class Ch44_Final {
	public static void main(String[] args) {

		Calculator44 c1 = new Calculator44();
		System.out.println(c1.PI);
//		Calculator44.PI = 10; error
	}
}
