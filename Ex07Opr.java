package day3;

import java.util.Scanner;

public class Ex07Opr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();

        String result = (age>=20) ? "성인입니다" : "미성년자입니다";
        System.out.println(result);

    }

}
