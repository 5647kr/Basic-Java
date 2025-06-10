// 제네릭이란
// 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법을 말한다.

class Class61_1 {
	public int rank;
	Class61_1(int rank) {
		this.rank = rank;
	}
}

class Class61_2<T, S> {
	public T info;
	public S id;
	Class61_2(T info, S id) {
		this.info = info;
		this.id = id;
	}
}

public class Ch61_Generic1 {
	public static void main(String[] args) {
		Integer id = new Integer(1);
		Class61_2<Class61_1, Integer> p1 = new Class61_2<Class61_1, Integer>(new Class61_1(1), id);
		System.out.println(p1.id.intValue());
	}
}
