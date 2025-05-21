public class Ch09_Operator {
  public static void main(String[] args) {
    System.out.println("========== 산술 연산자 ==========");
    // 산술 연산자(+, -, *, /, %)

    int result1 = 1 + 2;
    System.out.println("1 + 2 = " + result1);

    int result2 = 2 - 1;
    System.out.println("2 - 1 = " + result2);

    int result3 = 2 * 2;
    System.out.println("2 * 2 = " + result3);

    int result4 = 4 / 2;
    System.out.println("4 / 2 = " + result4);

    int result5 = 5 % 3;
    System.out.println("5 % 3 = " + result5);

    // 연산 형 변환
    int result6 = 10 / 3;
    System.out.println("10 / 3 = " + result6);

    float result7 = 10.0F / 3.0F;
    System.out.println("10.0F / 3.0F = " + result7);

    System.out.println("10 / 3.0F = " + (10 / 3.0F));


    System.out.println("========== 단항 연산자 ==========");
    
    int num1 = 1;
    num1++; // num1 = num1 + 1;
    System.out.println("num1: " + num1);


    System.out.println("========== 연산자 우선순위 ==========");
//    사칙연산을 생각한다.
    int num2 = 4 - 3 * 6;
    System.out.println("num2: " + num2);
  }
}
