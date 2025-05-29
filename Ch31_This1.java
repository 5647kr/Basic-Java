class C {
	int v = 10;

	void m() {
		int v = 20;

//		지역 변수
		System.out.println(v);
//		전역 변수
//		c1이라는 인스턴스를 생성하게 되는데 인스턴스 자신을 가르키는게 this이다.
		System.out.println(this.v);
	}
}

public class Ch31_This1 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
	}
}
