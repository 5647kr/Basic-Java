public class Ch40_Overloading2 {
public static class OverLoading1 {
	void A () {
		System.out.println("void A()");
	}

	void A (int arg1) {
		System.out.println("void A (int arg1)");
	}

	void A(String arg1) {
		System.out.println("void A (String arg1)");
	}
}

	public static void main(String[] args) {
		OverLoading1 oL1 = new OverLoading1();
		oL1.A();
		oL1.A(1);
		oL1.A("coding everyBody");
	}
}
