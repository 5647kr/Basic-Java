// Interface 실질적인 쓰임

// 가짜 클래스
class Calculator46 implements Ch46_CalculatorI {
	int x, y, z;
	public void setOperand(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int sum() {
		return this.x + this.y + this.z;
	}

	public int avg() {
		return (this.x + this.y + this.z) / 3;
	}
}


public class Ch46_Interface2 {
	public static void main(String[] args) {
		Calculator46 c1 = new Calculator46();
		c1.setOperand(10, 20, 30);
		System.out.println(c1.sum());
		System.out.println(c1.avg());
	}
}
