class A49 {
	public String x() {return "A.X";}
}
class B49 extends A49 {
	public String x() {return "B.X";}
	public String y() {return "Y";}
}

class C49 extends A49 {
	public String x() {return "C49.X";}
}

public class Ch49_Polymorphism2 {
	public static void main(String[] args) {
		A49 obj1 = new B49();
		A49 obj2 = new C49();
		System.out.println(obj1.x());
		System.out.println(obj2.x());
//		obj.x();
//		obj.y();
	}
}
