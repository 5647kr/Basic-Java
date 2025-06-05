// 1. 하나의 클래스가 여러개의 인터페이스를 구현할 수 있다.
interface I47_1 {
	public void a_1();
}

interface I47_2 {
	public void a_2();
}

class C1 implements I47_1, I47_2
{
	public void a_1() {}
	public void a_2() {}
}

// 2. 하나의 클래스가 여러개의 인터페이스를 구현할 수 있다.
interface I47_3 {
	public void b_1();
}

interface I47_4 extends I47_3
{
	public void b_2();
}

class C2 implements I47_4 {
	public void b_1() {};
	public void b_2() {};
}

// 3. 인터페이스의 맴버는 반드시 public 이여야 한다.