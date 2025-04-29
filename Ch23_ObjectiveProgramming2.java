public class Ch23_ObjectiveProgramming2 {
  public static void sum (int left, int right) {
    System.out.println("sum: " + (left + right));
  }

  public static void avg (int left, int right) {
    System.out.println("avg: " + (left + right) / 2);
  }

  public static void main(String[] args) {
    // 객체 지향 이전
    int left, right;

    left = 10;
    right = 20;
    
    sum(left, right);
    avg(left, right);
    
    left = 20;
    right = 40;
    
    sum(left, right);
    avg(left, right);
  }
}
