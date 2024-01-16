package day9;

import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = close(num1, num2);
        System.out.println("10에 가까운 수 " + result);
    }

    public static int close(int a, int b) {
        if(Math.abs(10 - a) < Math.abs(10-b) ) {
            return a;
        } else if (Math.abs(10 - a)== Math.abs(10-b)) {
            return 0;
        } else {
            return b;
        }

//        int a = 10 - num1;
//        int b = 10 - num2;
//
//        if(a < 0) {
//            a *= (-1);
//        }
//        if(b < 0) {
//            b *=(-1);
//        }
//
//        if(a < b) {
//            return num1;
//        }else if(b < a) {
//            return num2;
//        }else {
//            return 0;
//        }
    }

}
