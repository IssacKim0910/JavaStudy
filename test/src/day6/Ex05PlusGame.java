package day6;

import java.util.Random;
import java.util.Scanner;

public class Ex05PlusGame {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int num1 = rd.nextInt(100) + 1;
        int num2 = rd.nextInt(100) + 1;
        int answer = num1 + num2;

        while (true) {
            System.out.println("==Plus Game==");
            System.out.print(num1 + "+" + num2 + "=");
            int result = sc.nextInt();
            if (answer == result) {
                System.out.println("Success");
                num1 = rd.nextInt(100) + 1;
                num2 = rd.nextInt(100) + 1;
                answer = num1 + num2;
            } else {
                System.out.println("Fail");
            }
            System.out.print("계속 하시겠습니까>> ");
            String con = sc.next();
            if (con.equals("N") || con.equals("n")) {
                System.out.println("게임 종료");
                break;
            }
        }
    }
}