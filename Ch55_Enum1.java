public class Ch55_Enum1 {
	private final static int APPLE = 1;
	private final static int PEACH = 2;
	private final static int BANANA = 3;

	public static void main(String[] args) {
		/*
		* 1. 사과
		* 2. 복숭아
		* 3. 바나나
		*/
		int type1 = 1;
		switch (type1) {
			case 1:
				System.out.println(57);
				break;
			case 2:
				System.out.println(34);
				break;
			case 3:
				System.out.println(93);
				break;
		}


		int type2 = APPLE;
		switch(type2) {
			case APPLE:
				System.out.println(57 + " kcal");
				break;
			case PEACH:
				System.out.println(34 + " kcal");
				break;
			case BANANA:
				System.out.println(93 + " kcal");
				break;
		}






	}
}
