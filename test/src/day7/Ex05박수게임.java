package day7;

import java.util.Scanner;

public class Ex05박수게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] text = {'수', '박'};
        System.out.println("=====수박게임 Start!");
        System.out.print("숫자를 입력해주세요>> ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.print(text[i % 2]);
//            if(i % 2 == 0){
//                System.out.print(text[0]);
//            } else{
//                System.out.print(text[1]);
//            }
        }

    }
}