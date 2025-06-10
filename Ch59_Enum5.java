enum Fruit59 {
	APPLE("red"), PEACH("pink"), BANANA("yellow"), ORANGE("orange");
	private String color;
	public String getColor() {
		return this.color;
	}
	Fruit59(String color) {
		this.color = color;
	}
}


public class Ch59_Enum5 {
	public static void main(String[] args) {
		for(Fruit59 f: Fruit59.values()) {
			System.out.println(f);
		}
	}
}
