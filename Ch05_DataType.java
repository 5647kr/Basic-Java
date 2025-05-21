public class Ch05_DataType {
  public static void main(String[] args) {
    // 데이터의 크기
    /*
     * 8 bit(비트) -> 1byte(바이트)
     * 1024 byte(바이트) -> 1kilobyte(킬로바이트)
     * 1024 kilobyte(킬로바이트) -> 1megabyte(메가바이트)
     * 1024 megabyte(메가바이트) -> 1gigabyte(기가바이트)
     * 1024 gigabyte(기가바이트) -> 1terabyte(테라바이트)
     * 1024 terabyte(테라바이트) -> 1petabyte(페타바이트)
     * 1024 petabyte(페타바이트) -> 1exabyte(엑사바이트)
     * 1024 exabyte(엑사바이트) -> 1zettabyte(제타바이트)
     */

    // 정수형 데이터 타입
    System.out.println("========== 정수형 데이터 타입 ==========");
    // 1. byte(1byte): -128 ~ 127
    // 2. short(2byte): -32,768 ~ 32,767
    // 3. int(4byte): -2,147,483,648 ~ 2,147,483,647
    // 4. long(8byte): -900경 ~ 900경

    // byte num1 = 128; error
    short num2 = 128;
    System.out.println("short num2 = " + num2);

    // 결과적으로 정수를 표현할 땐 int를 사용을 권장한다.
    
    // 실수형 데이터 타입
    System.out.println("========== 실수형 데이터 타입 ==========");
    // 1. float(4byte)
    // 2. double(4byte)
    // 결과적으로 실수를 표현할 땐 double 사용을 권장한다.
    
    // 문자 데이터 타입
    System.out.println("========== 문자 데이터 타입 ==========");
    // 결과적으로 문자를 표현할 땐 char 사용을 권장한다.

    char ch1 = 'a';
    System.out.println(ch1);
  }
}
