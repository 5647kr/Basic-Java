class Calculator {
  // 1. 인스턴스 메소드는 클래스 맴버에 접근할 수 있다.
  // 2. 클래스 메소드는 인스턴스 맴버에 접근할 수 없다.
  // 인스턴스 변수 => non-static field
  // 클래스 변수 => static field
  
  // sum이란 메소드에 static 키워드를 붙이면 클래스 메소드가 된다. 클래스에 직접 접근해서 사용할 수 있다.
  public static void sum (int left, int right) {
    System.out.println("sum: " + (left + right));
  }

  public static void avg (int left, int right) {
    System.out.println("avg: " + (left + right) / 2);
  }
}

public class Ch27_ClassMethod {
  public static void main(String[] args) {
    Calculator.sum(10, 20);
    Calculator.avg(10, 20);

    Calculator.sum(20, 40);
    Calculator.avg(20, 40);
  }
}
