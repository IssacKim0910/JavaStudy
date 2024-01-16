package day8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex07비정방형배열2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        String[][] fList = {
                {"대접", "청준뚝배기", "해뜨는집", "그냥집밥", "신신식당", "명덕식당"},
                {"쿠로시오", "마시타", "런오프타마고", "전부"},
                {"1515", "황금성", "열도지"},
                {"수김밥", "고봉민", "한솥", "엄마의식탁"}};

        while (true) {
            System.out.print("1.분야별 추천 2.전체랜덤추천 3.종료 >> ");
            int menu = sc.nextInt();
            if (menu == 1) {
                System.out.println("====분야별 추천====");
                System.out.println("원하는 분야를 선택해주세요");
                System.out.print("1.한식 2.일식 3.중식 4.분식 >> ");
                int choice = sc.nextInt();

                int row = choice - 1;     //인덱스가 0부터 시작이니깐
                int col = ran.nextInt(fList[row].length);   //0부터 행안의 배열 길이까지 난수

                System.out.println(fList[row][col]);

            } else if (menu == 2) {
                int row = ran.nextInt(fList.length);
                int col = ran.nextInt(fList[row].length);
                System.out.println(fList[row][col]);

            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("정확한 숫자를 입력해주세요.");
            }

        }
    }
}

