package day5;

import java.util.Scanner;

public class Ex10약수구하기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a+"의 약수 ");

        for(int i = 1; i<=a; i++){
            if(a%i == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
