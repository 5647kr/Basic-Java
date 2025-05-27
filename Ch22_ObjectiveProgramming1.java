public class Ch22_ObjectiveProgramming1 {

  // 클래스와 인스턴스
  // 클래스: 설계도
  // 인스턴스: 설계도에 따라 만들어진 제품

  public static void sum (int left, int right) {
    System.out.println(left + right);
  }

  public static void main(String[] args) {

    //  객체지향 이전의 코딩 방식
    // 아래의 로직을 1000줄 짜리의 복잡한 로직이라 가정한다.
    System.out.println(10 + 20);
    System.out.println(20 + 40);


    // 중복을 제거 -> 메소드 사용
    sum(10, 20);
    sum(20, 40);
  }
}
