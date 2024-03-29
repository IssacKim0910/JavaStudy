package day4;

import java.util.Scanner;

public class Ex01Con {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 대입 연산자
        // = 우항(오른쪽)이 먼저 실행된다!!
        // 복합 대입 연산자
        // +=, -=, *=, /=, %=
        // num += 3; -> num = num + 3;
        // 증감 연산자
        // ++피연산자, --피연산자, 피연산자++, 피연산자--
        // 비교 연산자 : 결과 boolean타입
        // >, <, >=, <=, ==, !=
        // 논리 연산자 : 결과 boolean타입
        // !(Not), &&(And), ||(Or)
        // ! -> true, false 결과 뒤집는다
        // && -> 둘 다 true일 때만 true
        // || -> 둘 다 false일 때만 false
        // 조건 연산자 : 조건식의 결과에 따라 실행되는 곳이 다름
        // (조건식) ? (실행문1) : (실행문2)

        // 조건문
        // 1. 단순 if문
        // if(조건식){
        // 실행문장;
        // }
        // 조건식의 결과가 참(true)이면 실행문장 실행!
        // 거짓(false)이면 그냥 빠져나온다

        // 2. if-else문
        // 참과 거짓에 따라 실행문장이 달라질 때 사용!!
        // if(조건식){
        // 실행문장;
        // }else{
        // 실행문장;
        // }
        // 조건식의 결과가 참(true)이면 -> if절 실행문장 실행
        // 결과가 거짓(false)이면 -> else절 실행문장 실행
        final int PRICE_CAFE_MOCHA = 4000;
        final int PRICE_YUZA_TEA = 3000;
        final int PRICE_AMERICANO = 2000;

        System.out.print("소지 금액 : ");
        int money = sc.nextInt();

        if (money >= PRICE_CAFE_MOCHA) {
            System.out.println("카페모카 주문");
        } else if (money >= PRICE_YUZA_TEA) {
            System.out.println("유자차 주문");
        } else if (money >= PRICE_AMERICANO) {
            System.out.println("아메리카노 주문");
        } else {
            System.out.println("물 마시자");
        }
    }
}
