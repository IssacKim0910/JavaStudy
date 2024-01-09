package day6;

import java.util.Scanner;

public class Ex02EatSushi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("선수 이름 입력 : ");
        String name = sc.next();

        System.out.print("선수의 총 칼로리 입력 : ");
        int playerKal = sc.nextInt();

        System.out.print("스시 한접시 칼로리 입력 : ");
        int sushiKal = sc.nextInt();

        int count = 0;

        while(playerKal>=sushiKal) {
            playerKal -= sushiKal;
            count ++;
        }
        System.out.println(name+" 선수는 총 " +count+"접시의 스시를 먹었습니다");
    }
}
