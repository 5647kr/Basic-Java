class Calculator39 {
	int x, y;
	int z = 0;

	/*
	* 자바입장에선 메소드의 이름이 같다고 해도 매개변수의 수나 타입이 다르다면 다른 메소드로 인식하는데 이를 메소드 오버로딩이라 한다.
	* */

	public void setOperands(int x, int y) {
		System.out.println("setOperands(int x, int y)");
		this.x = x;
		this.y = y;
	}

	public void setOperands(int x, int y, int z) {
		this.setOperands(x, y);
		System.out.println("setOperands(int x, int y, int z)");
//		중복 제거
//		this.x = x;
//		this.y = y;
		this.z = z;
	}

	public void sum() {
		System.out.println("sum:" + (this.x + this.y + this.z));
	}

	public void avg() {
		System.out.println("avg:" + (this.x + this.y + this.z) / 2);
	}


}


public class Ch39_Overloading1 {
	public static void main(String[] args) {
		Calculator39 c1 = new Calculator39();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.setOperands(10, 20, 30);
		c1.sum();
		c1.avg();
	}
}
