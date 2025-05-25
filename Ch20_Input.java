public class Ch20_Input {
  // 매개변수와 인자

  // int limit을 매개변수(parameter)
  public static void numbering1(int limit) {
    int i = 0;
    while (i < limit) {
      System.out.println("매개변수 1개: " + i);
      i++;
    }
  }

  public static void numbering2(int init, int limit) {
    int i = init;
    while (i < limit) {
      System.out.println("매개변수2개이상: "+ i);
      i++;
    }
  }

  public static void main(String[] args) {
    // 5: 인자(argument)
    numbering1(5);
    numbering2(3, 5);
  }

}
