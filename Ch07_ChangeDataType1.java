public class Ch07_ChangeDataType1 {
  public static void main(String[] args) {
    // 암시적 형 변환
    // 데이터 타입을 변환하는 것으로 int -> double로 변환하는 것을 말한다.
    // 형 변환이 가능한 관계
    /* 역방향으로 변환할 수는 없다.
     * byte -> short -> int -> long -> float -> double
     *         char  ->
     */

    System.out.println("========== 암시적 형 변환 ==========");

    int num1 = 3; // int
    float num2 = 1.0F; // float
    double num3 = num1 + num2;

    System.out.println("num1 + num2 = " + num3);
  }
}
