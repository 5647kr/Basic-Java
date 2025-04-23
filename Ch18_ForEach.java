public class Ch18_ForEach {
  public static void main(String[] args) {
    System.out.println("==========문자열 배열==========");
    // 문자열 배열
    String[] arr1 = {"str1", "str2", "str3", "str4"};
    for(String e : arr1) {
      System.out.println("str: " + e);
    }
    
    
    System.out.println("==========숫자형 배열==========");
    // 숫자형 배열
    int[] arr2 = {1, 2, 3, 4};
    for(int e : arr2) {
      System.out.println("num: " + e);
    }
  }
}
