enum Fruit58 {
	APPLE("red"), PEACH("pink"), BANANA("yellow"), ORANGE("orange");
	public String color;
	public String getColor() {
		return this.color;
	}
	Fruit58(String color) {
		System.out.println("Call Constructor " + this);
		this.color = color;
	}
}

public class Ch58_Enum4 {
	public static void main(String[] args) {
		Fruit58 type = Fruit58.APPLE;
		switch(type) {
			case APPLE:
				System.out.println(57 + " kcal, color: " + Fruit58.APPLE.getColor());
				break;
			case PEACH:
				System.out.println(34 + " kcal, color: " + Fruit58.PEACH.getColor());
				break;
			case BANANA:
				System.out.println(93 + " kcal, color: " + Fruit58.BANANA.color);
				break;
			case ORANGE:
				System.out.println(80 + " kcal, color: " + Fruit58.ORANGE.color);
				break;
		}
	}
}
