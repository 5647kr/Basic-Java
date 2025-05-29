public class Ch29_Scope2 {
	static void a() {
		String title = "Coding everday";
	}

	public static void main(String[] args) {
		a();
//		System.out.println(title); error

		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}

//		System.out.println(i); error
	}

}
