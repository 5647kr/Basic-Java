class Calculator50 {
	int x, y;
	public void setOperand(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void sum() {
		System.out.println("더하기의 계산 결과는");
		System.out.println(this.x + this.y);
		System.out.println("입니다.");
	}

	public void divide() {
//		System.out.println("나누기의 계산 결과는");
//		System.out.println(this.x / this.y); error
//		System.out.println("입니다.");

	try {
		System.out.println("나누기의 계산 결과는");
		System.out.println(this.x / this.y);
		System.out.println("입니다.");
	} catch(Exception e) {
		System.out.println("e.getMessage():" + e.getMessage());
		System.out.println("e.toString():" + e.toString());
		System.out.println("e.printStackTrace():");
		e.printStackTrace();
		}
	}
}

public class Ch50_Exception1 {
	public static void main(String[] args) {
		Calculator50 c1 = new Calculator50();
		c1.setOperand(10, 0);
		c1.divide();
	}
}
