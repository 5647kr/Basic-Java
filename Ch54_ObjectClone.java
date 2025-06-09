// clone


class Student54 implements Cloneable {
	String name;
	Student54(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Ch54_ObjectClone {
	public static void main(String[] args) {
		Student54 s1 = new Student54("ego");
		try {
			Student54 s2 = (Student54)s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}
}
