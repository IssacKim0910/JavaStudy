package day6;

import java.util.Scanner;

public class Ex07숫자놀이_다른코드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int sum = 0;
        int cnt = 0;

        do {
            System.out.print("숫자 입력 : ");
            a = sc.nextInt();
            sum += a;
            cnt++;
        } while (a < 100);
        sum -= a;       //100 이상을 입력해도 값을 저장하기때문에
        cnt--;          //최근에 저장된 값 빼주기
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + (float)sum / cnt);


    }
}
