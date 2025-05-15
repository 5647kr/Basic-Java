public class Ch26_ClassVariable {
  static class Calculator {
    // 클래스 변수의 용도
    // 1. 인스턴스에 따라서 변하지 않는 값이 필요한 경우
    // 2. 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우
    // 3. 값의 변경 사항을 모든 인스턴스가 공유해야 하는 경우

    static int base = 0;
    int left, right;

    public void setOperands(int left, int right) {
      this.left = left;
      this.right = right;
    }

    public void sum () {
      System.out.println("sum: " + (this.left + this.right + base));
    }
  
    public void avg () {
      System.out.println("avg: " + (this.left + this.right + base) / 2);
    }
  }

  public static void main(String[] args) {
    Calculator c1 = new Calculator();
    c1.setOperands(10, 20);
    c1.sum();
    c1.avg();

    Calculator c2 = new Calculator();
    c2.setOperands(20, 40);
    c2.sum();
    c2.avg();
    
    Calculator.base = 10;
    c2.sum();
    c2.avg();
  }
}