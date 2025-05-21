public class Ch06_ConstantDataType {
  public static void main(String[] args) {
    // 상수의 데이터 타입

    // 상수란 변하지 않는 값을 의미한다.
    System.out.println("========== 상수 데이터 타입 ==========");

    double num1 = 2.2;
    float num2 = 2.2F;

    System.out.println(num1);
    System.out.println(num2);

    // int num3 = 2147483648; error
    // long num4 = 2147483648; error
    long num5 = 2147483648L;
    System.out.println(num5);
  }
}
