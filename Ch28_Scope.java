public class Ch28_Scope {

  static void num() {
    int i = 0;
  }

  public static void main(String[] args) {
    for(int i = 0; i < 5; i++) {
      num();
      System.out.println("num: " + i);
    }
  }
}
