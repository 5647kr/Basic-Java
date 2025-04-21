public class Ch16_Array {
  public static void main(String[] args) {
    // 배열
    System.out.println("==========배열==========");

    // 배열 선언 방법
    // element타입[] 배열이름 = {elem1, elem2, elem3}
    String[] arr1 = {"item1", "item2", "item3", "item4"};

    System.out.println("arr1[0]:" + arr1[0]);
    System.out.println("arr1[1]:" + arr1[1]);
    System.out.println("arr1[2]:" + arr1[2]);
    System.out.println("arr1[3]:" + arr1[3]);
    System.out.println("arr1.length:" + arr1.length);
    
    // 생성자 배열 선언
    String[] arr2 = new String[4];
    // new 타입[배열 길이]
    arr2[0] = "item1";
    System.out.println("arr2.length:" + arr2.length);
    arr2[1] = "item2";
    System.out.println("arr2.length:" + arr2.length);
    arr2[2] = "item3";
    System.out.println("arr2.length:" + arr2.length);
    arr2[3] = "item4";
    System.out.println("arr2.length:" + arr2.length);

    // error 넘치면 에러가 난다.
    // arr2[4] = "item5";
    // System.out.println("arr2.length:" + arr2.length);
  }
}
