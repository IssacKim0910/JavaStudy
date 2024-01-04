package day2;


import java.util.Scanner;

public class Ex06Input {
    public static void main(String[] args) {

        // 입력
        // Scanner -> 레퍼런스 타입
        // 기본 데이터 타입
        // 키워드 변수명 = 값;

        // 레퍼런스 데이터 타입
        // 타입이름 변수명 = new 타입이름();

        Scanner sc = new Scanner(System.in);

        final int PRICE = 500;

        System.out.print("사려는 붕어빵의 개수 : ");
        int count = sc.nextInt();

        System.out.println("가격은 "+ count * PRICE+"원 입니다");
    }
}
