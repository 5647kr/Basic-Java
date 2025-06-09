// enum: 서로 연관된 상수들의 집합이다.

//class Fruit {
//	public static final Fruit APPLE = new Fruit();
//	public static final Fruit PEACH = new Fruit();
//	public static final Fruit BANANA = new Fruit();
//	public static final Fruit ORANGE = new Fruit();
//}

enum Fruit57 {
	APPLE, PEACH, BANANA, ORANGE;
}

//class Company {
//	public static final Company GOOGLE = new Company();
//	public static final Company APPLE = new Company();
//	public static final Company ORACLE = new Company();
//	public static final Company ORANGE = new Company();
//}

//enum Company {
//	GOOGLE, APPLE, ORACLE, ORANGE
//}


public class Ch57_Enum3 {
	public static void main(String[] args) {
		Fruit57 type1 = Fruit57.APPLE;
		switch (type1) { // error
			case APPLE:
				System.out.println(57 + " kcal");
				break;
			case PEACH:
				System.out.println(34 + " kcal");
				break;
			case BANANA:
				System.out.println(93 + " kcal");
				break;
			case ORANGE:
				System.out.println(93 + " kcal");
				break;
		}
	}
}
