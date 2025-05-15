public class Ch25_ClassMember {
  static class Calculator {
    static double PI = 3.14;
    // static 키워드가 붙어 있으면 클래스에 소속이 되어 모든 인스턴스에서 같은 값을 가지게 된다.
    // 어디서든 똑같은 값을 가지게 된다.
    // 클래스 변수는 클래스의 변수이기 때문에 클래스에 따라 만들어진 인스턴스들은 클래스의 변수를 자연스럽게 가지게 된다.
    int left, right;

    public void setOperands(int left, int right) {
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
    // 인스턴스의 변수
    // 인스턴스 마다 다른 값을 가지게 되는 변수
    // left, right
    Calculator c1 = new Calculator();
    System.out.println("c1.PI: " + c1.PI);
    
    Calculator c2 = new Calculator();
    System.out.println("c2.PI: " + c2.PI);


    System.out.println("Calculator.PI: " + Calculator.PI);
  }
}
