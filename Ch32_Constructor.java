class Calculator32 {
	int left, right;

//	생성자(Constructor)
	public Calculator32 (int left, int right) {
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

public class Ch32_Constructor {
	public static void main(String[] args) {
		Calculator32 c1 = new Calculator32(10, 20);
		c1.sum();
		c1.avg();


		Calculator32 c2 = new Calculator32(20, 40);
		c2.sum();
		c2.avg();


	}
}
