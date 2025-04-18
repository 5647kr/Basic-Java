public class Ch11_If {
  public static void main(String[] args) {
    // 조건문
    /*
     * if(조건) {
     *  조건이 참일 때, 실행할 코드
     * } else {
     *  조건이 거짓일 떄, 실행할 코드
     * }
     */
    if(true) {
      System.out.println("result: true");
    }


    if(false) {
      System.out.println("result: true");
    } else {
      System.out.println("result: false");
    }


    if(false) {
      System.out.println(1);
    } else if(true) {
      System.out.println(2);
    } else {
      System.out.println(3);
    }
  }
}
