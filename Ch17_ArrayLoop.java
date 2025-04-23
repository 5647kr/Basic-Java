public class Ch17_ArrayLoop {
  public static void main(String[] args) {
    // 배열과 반복문의 조화

    System.out.println("==========문자열 배열==========");
    // 문자열 배열
    String[] arr1 = {"str1", "str2", "str3", "str4"};
    for(int i = 0; i < arr1.length; i++) {
      String str = arr1[i];
      System.out.println("str: " + str);
    }
    
    
    System.out.println("==========숫자형 배열==========");
    // 숫자형 배열
    int[] arr2 = {1, 2, 3, 4};
    for(int i = 0; i < arr2.length; i++) {
      int num = arr2[i];
      System.out.println("num: " + num);
    }
  }
}
