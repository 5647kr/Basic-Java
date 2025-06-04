class A {
	public String a() {
		return "public void a()";
	}
	private String b() {
		return "public void b()";
	}
	public String c() {
		return b();
	}
}


public class Ch41_AccessModifier1 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a());
//		System.out.println(a.b()); error
		System.out.println(a.c());
	}
}
