package day5;

import java.util.Scanner;

public class Ex03원하는구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단 입력 : ");
        int a = sc.nextInt();
        System.out.print("범위 입력 : ");
        int b = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            System.out.println(a + "*" + i + "=" + a * i);
        }
    }
}
