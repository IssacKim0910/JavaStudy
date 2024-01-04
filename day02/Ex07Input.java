package day2;

import java.util.Scanner;

public class Ex07Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //new -> reference type에 필요한 키워드

        final int PRICE_RED = 1500;
        final int PRICE_SHOO = 1000;


        System.out.print("사려는 팥붕 개수 :");
        int count_red = sc.nextInt();
        System.out.print("사려는 슈붕 개수 :");
        int count_shoo = sc.nextInt();

        int a = PRICE_RED * count_red;
        int b = PRICE_SHOO * count_shoo;
        //System.out.println("팥붕 가격 = " + a + " 슡붕가격 = " + b +" 총액은 " + (a+b)+ " 원 입니다");
        System.out.println("가격은 " + (a+b)+" 원 입니다");


    }
}
