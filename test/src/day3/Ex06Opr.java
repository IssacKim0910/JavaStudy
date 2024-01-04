package day3;

import java.util.Scanner;

public class Ex06Opr {
    public static void main(String[] args) {

        // 삼항 연산자
        // 6. 조건 연산자
        // (조건식)? (실행문1) : (실행문2)
        // 조건식은 결과값이 boolean
        boolean isRainy = false;

        System.out.println((isRainy) ? "비가온다" : "비가 오지 않는다");


        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        String isEven = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(isEven);


    }
}
