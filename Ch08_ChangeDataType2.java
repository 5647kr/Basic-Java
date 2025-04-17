public class Ch08_ChangeDataType2 {

  public static void main(String[] args) {
    // 명시적 형 변환

    // float num1 = 100.0; error;
    // int num2 = 100.0F; error

    float num3 = (float) 100.0;
    int num4 = (int) 100.0F;

    System.out.println(num3);
    System.out.println(num4);
  }
}