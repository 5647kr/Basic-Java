public class Ch02_String {
  // 데이터 타입: 문자열
  public static void main(String[] args) {
    // 문자와 문자열
    // 문자(character)는 문자열을 이루는 최소한의 단위(a, b, c)
    // 문자는 ''(홑따옴표)로 표현한다.
    System.out.println('a');

    // 문자열(string)은 문자의 묶음 단위(apple)
    // 문자열은 ""(쌍따옴표)로 표현한다, 홑따옴표 사용시 에러가 발생한다.
    System.out.println("apple");
    // System.out.println('apple'); Error

    // 문자열을 결합할 땐 + 연산자를 사용한다.
    System.out.println("==========문자열 결합==========");
    System.out.println("코딩" + "입니다");

    // "1" + "1" 은 숫자같지만 문자로 인식하여 결합한다.
    System.out.println("==========숫자 결합==========");
    System.out.println("1" + "1");

    // 문자열 안에 쌍따옴표를 표현하려면
    System.out.println("==========문자열내 쌍따옴표 표현==========");
    System.out.println("안녕하세요 \"코딩입니다.\"");

    // 문자열을 여러줄로 표현하려면
    System.out.println("==========문자열 여러줄 표현==========");
    System.out.println("안녕하세요 \n코딩입니다.");
  }
}
