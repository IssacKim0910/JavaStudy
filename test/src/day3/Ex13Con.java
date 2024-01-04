package day3;

import java.util.Scanner;

public class Ex13Con {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 90) {
            System.out.println('a');
        } else if (num >= 80) {
            System.out.println('b');
        }
        else {
            System.out.println('F');
        }
    }
}