package day4;

import java.util.Scanner;

public class Ex02Con {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int totalScore = sc.nextInt();

        if (totalScore >= 90) {
            System.out.println("A");
        } else if (totalScore >= 80) {
            System.out.println("B");
        } else if (totalScore >= 70) {
            System.out.println("C");
        } else if (totalScore >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
