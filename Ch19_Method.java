public class Ch19_Method {
  // js에서 함수

  // 메소드의 정의
  public static void numbering() {
    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
    }
  }

  public static void main(String[] args) {
//    main이라고 하는것이 method이다.

    // 메소드의 호출
    numbering();
  }
}