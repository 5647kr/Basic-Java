class Class60 {
	public int id;
	Class60(int id) {
		this.id = id;
	}
}

public class Ch60_Reference1 {
	public static void value60() {
		int x = 1;
		int y = x;
		y = 2;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

	public static void ref60() {
		Class60 z = new Class60(1);
		Class60 a = z;
		a.id = 2;
		a = new Class60(2);
		System.out.println("ref60: " + z.id);
	}
	public static void main(String[] args) {
		value60();
		ref60();
	}

}
