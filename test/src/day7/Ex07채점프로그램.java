package day7;

import java.util.Scanner;

public class Ex07채점프로그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = new int[5];
        int[] answer = {1, 4, 3, 2, 1};
        int count = 0;

        System.out.println("==채점하기==");
        for (int i = 0; i < input.length; i++) {
            System.out.print((i + 1) + "번답>>");
            input[i] = sc.nextInt();
        }
        System.out.println("정답확인");
        for (int j = 0; j < input.length; j++) {
            if (input[j] == answer[j]) {
                System.out.print("O" + " ");
                count += 20;
            } else {
                System.out.print("X" + " ");
            }
        }
        System.out.println("총점 : " + count);


//        for (int j = 0; j < input.length; j++) {      //출력을 못하네
//            System.out.print(input[j] + " ");
//        }
    }
}
