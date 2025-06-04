abstract class A43 {
	public abstract int a ();

	public void b() {
		System.out.println("b");
	}

//	error
//	public abstract int c() {
//		System.out.println("C");
//	}
}

class B43 extends A43 {
	public int a() {
		return 1;
	}
}



public class Ch43_Abstract1 {
	public static void main(String[] args) {
//		Abstract는 Abstract로 지정된 메소드나 클래스는 직접 사용할 수 없고 반드시 상속한 클래스를 만들어 사용해야 한다.
//		A obj = new A(); error
		B43 obj = new B43();
	}
}
