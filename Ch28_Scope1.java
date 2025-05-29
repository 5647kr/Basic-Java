public class Ch28_Scope1 {

//  지역 변수
  static void num1() {
    int i = 0;
  }

//  전역 변수
  static int j;

  static void num2() {
    j = 0;
  }

  public static void main(String[] args) {
    for(int i = 0; i < 5; i++) {
      num1();
      System.out.println("num1: " + i);
    }

//    무제한 실행
    for(int j = 0; j < 5; j++) {
      num2();
      System.out.println("num2: " + j);
    }
  }
}
