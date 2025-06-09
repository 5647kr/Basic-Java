// equals

class Student53 {
	String name;
	Student53(String name)
	{
		this.name = name;
	}

	public boolean equals(Object obj) {
		Student53 s = (Student53)obj;
		return this.name == s.name;
	}
}

public class Ch53_ObjectEquals {
	public static void main(String[] args) {
		Student53 s1 = new Student53("ego");
		Student53 s2 = new Student53("ego");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
