package day11;

import java.util.Scanner;

public class PeopleMain {
    public static void main(String[] args) {
        // People 이라는 설계도에 의해서 객체(Object)가 만들어지는 클래스
            // 1. 객체(사람) 생성
        // 객체를 생성할 때 new 키워드 사용
        // 변수 앞 키워드 -> 데이터 타입(클래스)
        Scanner sc = new Scanner(System.in);
        //클래스명 변수명 = new 클래스();
        People p1 = new People();
        People p2 = new People();
        People p3 = new People("an", 200, "man");

        p1.name = "김동혁";
        p1.height = 182.2;
        p1.gender = "Man";
        System.out.println(p1.name);
        System.out.println(p1.height);
        System.out.println(p1.gender);

        p1.coding();
        p1.sleep();
        p1.talk();
        System.out.println(p3.name);
        System.out.println(p3.height);
        System.out.println(p3.gender);
        p3.coding();
        p3.sleep();
        p3.talk();
    }
}
