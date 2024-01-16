package day10;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startValue = sc.nextInt();
        int endValue = sc.nextInt();
        getPerfectNumber(startValue, endValue);
    }


    public static void getPerfectNumber(int startValue, int endValue) {
        System.out.print(startValue + "~" + endValue + "까지의 완전수 : ");

        for (int i = startValue; i < endValue; i++) {
            int num = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    num += j;
                }
            }
            if (num == i) {
                System.out.print(num + " ");
            }
        }
    }
}
