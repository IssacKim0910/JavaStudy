package day6;

import java.util.Scanner;

public class Ex07숫자놀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= 0;
        int sum = 0;
        float avg = 0;
        int cnt = 0;

        do {
            System.out.print("숫자를 입력하세요 : ");
            a = sc.nextInt();
            if (a > 100) {
                break;
            }
            sum += a;                           //sum이 if 보다 위에 있으면 a가 100이넘어도 더하고 탈출하기때문에
            cnt++;                              //break로 빠져나오고 sum 을 구한다.
            avg = sum / (float) cnt;
        } while (true);
        System.out.println("합계 :" + sum);
        System.out.println("평균 : " + avg);
    }
}
