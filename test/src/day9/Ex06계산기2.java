package day9;

import java.util.Scanner;

public class Ex06계산기2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수 입력 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자 입력(+, -, *, /) : ");
        String op = sc.next();

        System.out.println(cal(num1,num2,op));
    }


    public static int cal(int a, int b, String op) {
        int result = 0;
        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result =  a * b;
        } else if (op.equals("/")) {
            result =  a / b;
        }
        return result;
    }

}