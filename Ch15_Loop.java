public class Ch15_Loop {
  public static void main(String[] args) {
    // 반복문

    System.out.println("========== while 문 ==========");

    //*while(조건식) {
    //  반복 실행할 영역
    //} 
  
    int num1 = 0;
    while(num1 < 10) {
      System.out.println("num1: " + num1);
      num1++;
    }


    System.out.println("========== for 문 ==========");
    
    //for(초기화; 종료조건; 반복실행) {
    //  반복 실행할 영역
    //} 
    
    System.out.println("----- for 문1 -----");
    for(int i = 0; i < 10; i++) {
      System.out.println("num2:" + i);
    }
    
    System.out.println("----- for 문2 -----");
    for(int i = 0; i < 10; i+= 2) {
      System.out.println("num3:" + i);
    }


    System.out.println("========== break & continue 문 ==========");
    
    //for(초기화; 종료조건; 반복실행) {
    //  반복 실행할 영역
    //} 
    
    System.out.println("----- break 문 -----");
    for(int i = 0; i < 10; i++) {
      if(i == 5) {
        break; // 구문이 한줄이면 {}를 생략할 수 있다.
      }
      System.out.println("num4:" + i);
    }

    System.out.println("----- continue 문 -----");
    for(int i = 0; i < 10; i++) {
      if(i == 5) {
        continue;
      }
      System.out.println("num4:" + i);
    }


    System.out.println("========== 반복문 중첩 ==========");
    for(int i = 1; i < 10; i++) {
      for(int j = 1; j < 10; j++) {
        System.out.println(i + " * " + j + " = " + (i * j));
      }
    }
  }
}
