package day3;

import java.util.Scanner;

public class Ex11Con {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int set = 10000;

        System.out.print("사려는 세트수를 입력하세요 : ");
        int count = sc.nextInt();
        int result;
        double discount = 10 * 1.0 / 100;     //변수를 사용할때 Refactoring, 가독성 향상
        if (count >= 11) {
            result = (int) (set * count *(1-discount)); //11개 이상 사면 10% 할인
        }
        else{
            result = set * count;
        }
        System.out.println(result + " 원 입니다");
    }
}
