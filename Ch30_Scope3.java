public class Ch30_Scope3 {
	static int i = 5;

	static void a() {
		int i = 10;
		b();
	}

	static void b() {
//		전역 변수 사용
		System.out.println(i);
	}

	public static void main(String[] args) {
		a();
	}

}
