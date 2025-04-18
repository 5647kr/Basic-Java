public class Ch10_Boolean {
  public static void main(String[] args) {
    // 비교와 Boolean
    System.out.println("========== Boolean ==========");
    // 참과 거짓을 의미하는 데이터이다.

    
    System.out.println("==========비교 연산자==========");
    // 비교 연산자
    System.out.println("1 == 2: " + (1 == 2));
    System.out.println("1 == 1: " + (1 == 1));
    System.out.println("one == two: " + ("one" == "two"));
    System.out.println("one == one: " + ("one" == "one"));
    

    System.out.println("==========Not 연산자==========");
    // Not 연산자
    System.out.println("1 != 2: " + (1 != 2));
    System.out.println("1 != 1: " + (1 != 1));
    System.out.println("one != two: " + ("one" != "two"));
    System.out.println("one != one: " + ("one" != "one"));
    

    System.out.println("==========부등호 연산자==========");
    // 부등호 연산자
    System.out.println("1 > 2: " + (1 > 2));
    System.out.println("1 < 2: " + (1 < 2));
    System.out.println("1 > 1: " + (1 > 1));

    System.out.println("1 >= 2: " + (1 >= 2));
    System.out.println("1 <= 2: " + (1 <= 2));
    System.out.println("1 >= 1: " + (1 >= 1));
  }
}
