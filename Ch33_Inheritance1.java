class Calculator33 {
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

public class Ch33_Inheritance1 {
	public static void main(String[] args) {
/*
상속란?
* 새로운 객체가 기존의 객체가 가지고 있는 변수 또는 메소드를
* 그대로 물려받아 새로운 변수나 메소드를 추가하거나 기존
* 변수나 메소드를 수정 변경하여 사용하는 것을 상속이라 한다.
*/

		Calculator33 c1 = new Calculator33();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
//		c1.sub(); 객체를 자신이 만들지 않는다.
	}
}
