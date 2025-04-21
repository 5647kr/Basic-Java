public class Ch14_Condition {
  public static void main(String[] args) {
    // 논리 연산자

    // and(&&) 연산자
    if(true && true) {
      System.out.println("and 연산자1 출력");
    }

    if(true && false) {
      System.out.println("and 연산자2 출력");
    }

    if(false && false) {
      System.out.println("and 연산자3 출력");
    }

    // or(||) 연산자
    if(true || true) {
      System.out.println("or 연산자1 출력");
    }
    
    if(true || false) {
      System.out.println("or 연산자2 출력");
    }
    
    if(false || false) {
      System.out.println("or 연산자3 출력");
    }

    // not(!) 연산자
    if(!true) {
      System.out.println("not 연산자1 출력");
    }
    
    if(!false) {
      System.out.println("not 연산자2 출력");
    }
  
  }
}
