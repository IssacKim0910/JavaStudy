package day3;

public class Ex01Opr {
    public static void main(String[] args) {

        // 2.대입연산자
        int a; //변수의 선언
        a = 1; //정수 1을 a 변수에 대입

        // 특징 : = 우항(오른쪽)이 먼저 실행된다
        // 우항(오른쪽)의 결과가 좌황에 대입(저장)된다

        int b;
        b = 2;

        // 복합대입 연산자
        b += 2;

        int age;
        age = 26;
        age += 1;
        System.out.println(age);

        int num = 10;
        num += 1; //11
        num -= 3; //8
        num *= 2; //16
        num /= 3; //5
        num %= 2; //1
        System.out.println(num);

    }
}
