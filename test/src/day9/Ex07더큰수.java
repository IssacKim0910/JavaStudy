package day9;

import java.util.Scanner;

public class Ex07더큰수 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();


        int result = largerNumbers(num1, num2);
        System.out.println("큰 수 확인 : " + result);
    }


    public static int largerNumbers(int a, int b) {
//        if(a > b) {
//            return a;
//        }
//        else if(b > a) {
//            return b;
//        }
//        else {
//            return 0;
//        }

        if(a == b){
            return 0;
        } else{
            return a > b ? a : b;
        }
    }



}
