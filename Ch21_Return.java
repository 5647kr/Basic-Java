public class Ch21_Return {
  public static String numbering1(int init, int limit) {
    int i = init;
    String output = "";
    while (i < limit) {
      output += i;
      i++;
    }
    return output;
  }

  // main 앞에 void는 return값이 없다는 뜻이다.
  // numbering1에서 앞에 String은 반환값으로 문자열을 무조건 반환한다는 뜻이다.
  public static void main(String[] args) {
    String result = numbering1(1, 5);
    System.out.println("result: " + result);
  }
}
