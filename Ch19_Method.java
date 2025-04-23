public class Ch19_Method {
    // 메소드의 정의
  // js에서 함수와 비슷한 느낌
  public static void numbering() {
    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
    }
  }

  public static void main(String[] args) {
    // 메소드의 호출
    numbering();
  }
}
