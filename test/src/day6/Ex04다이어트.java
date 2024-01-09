package day6;

import java.util.Scanner;

public class Ex04다이어트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("현재몸무게 : ");
        int a = sc.nextInt();
        System.out.print("목표몸무게 : ");
        int b = sc.nextInt();
        int cnt = 1;


        while (a > b) {
            System.out.print(cnt + "주차 별 감량몸무게 : ");
            int c = sc.nextInt();
            a = a - c;
            cnt++;
        }
        System.out.println(a + "kg 달성!! 축하합니다");

    }
}

