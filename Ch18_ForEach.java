public class Ch18_ForEach {
  public static void main(String[] args) {
    System.out.println("========== 문자열 배열 ==========");
    // 문자열 배열
    String[] arr1 = {"str1", "str2", "str3", "str4"};
//    arr1을 순회하면서 안에 있는 데이터의 값을 e라는 변수에 저장한다.
    for(String e : arr1) {
      System.out.println("str: " + e);
    }
    
    
    System.out.println("========== 숫자형 배열 ==========");
    // 숫자형 배열
    int[] arr2 = {1, 2, 3, 4};
    for(int e : arr2) {
      System.out.println("num: " + e);
    }
  }
}
