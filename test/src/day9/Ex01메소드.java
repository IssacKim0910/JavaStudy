package day9;

public class Ex01메소드 {
    public static void main(String[] args) {

        // 메소드 호출
        // 메소드이름(매개변수)
        System.out.println(sum(5,10));
        System.out.println(sum(3,12));

    }
    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

}

//메소드 구조
// 1. 접근제한자 - public (내/외부에서 접근 가능)
// 2. static - 저장공간
// 3. 리턴타입 (리턴값이 없는 경우 void 키워드 사용)
// 4. 메소드이름(매개변수 나열)
// 5. return 키워드 -> 반환값