class Fruit {
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
	public static final Fruit ORANGE = new Fruit();
}

class Company {
	public static final Company GOOGLE = new Company();
	public static final Company APPLE = new Company();
	public static final Company ORACLE = new Company();
	public static final Company ORANGE = new Company();
}


public class Ch56_Enum2 {

	public static void main(String[] args) {
//		error
//		if(Fruit.APPLE == Company.APPLE) {
//			System.out.println("APPLE은 같습니다.");
//		}
//
//		if(Fruit.ORANGE == Company.ORANGE) {
//			System.out.println("ORANGE는 같습니다.");
//		}



		Fruit type1 = Fruit.APPLE;
//		switch (type1) { // error
//			case Fruit.APPLE:
//				System.out.println(57 + " kcal");
//				break;
//			case Fruit.PEACH:
//				System.out.println(34 + " kcal");
//				break;
//			case Fruit.BANANA:
//				System.out.println(93 + " kcal");
//				break;
//		}

	}
}
