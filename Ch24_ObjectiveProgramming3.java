public class Ch24_ObjectiveProgramming3 {

//  class는 지금부터 Calculator라는 객체의 설계도를 알려주겠다라는 의미
  static class Calculator {
    int left, right;

    public void setOperands(int left, int right) {
//     this는 위에서 선언한 int left, right를 가르키게 된다.
      this.left = left;
      this.right = right;
    }

    public void sum () {
      System.out.println("sum: " + (this.left + this.right));
    }
  
    public void avg () {
      System.out.println("avg: " + (this.left + this.right) / 2);
    }
  }

  public static void main(String[] args) {
    // 객체화
    // class는 new 키워드를 이용해서 c1, c2라는 객체를 만들었는데 이 객체를 인스턴스라 한다.
    // 인스턴스는 class를 설계도에 따라 만들어진 제품이다.

//    Calculator라 적은 것은 c1이라는 변수는 Calculator라는 객체를 담을 수 있는 컨테이너이다.
//    즉, Calculator라는 것은 데이터 타입이다.
    Calculator c1 = new Calculator();// 인스턴스
    c1.setOperands(10, 20);
    c1.sum();
    c1.avg();

    Calculator c2 = new Calculator();// 인스턴스
    c2.setOperands(10, 20);
    c2.sum();
    c2.avg();
  }
}
