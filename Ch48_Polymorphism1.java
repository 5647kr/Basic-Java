// 다형성: 하나의 메소드나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것을 의미한다.

class Poly48 {
	public void a(int params) {
		System.out.println("숫자 출력");
		System.out.println(params);
	}

	public void a(String params) {
		System.out.println("문자 출력");
		System.out.println(params);
	}
}


public class Ch48_Polymorphism1 {
	public static void main(String[] args) {
		Poly48 p = new Poly48();
		p.a(1);
		p.a("one");
	}
}
