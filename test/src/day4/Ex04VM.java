package day4;
//자판기 머신
import java.util.Scanner;

public class Ex04VM {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("투입 금액 : ");
            int money = sc.nextInt();
            System.out.println("==============메뉴==============");
            System.out.println("[1]쌍화차 [2]Dr.Pepper [3]데자와");
            System.out.println("2000원    1500원       1000원");
            System.out.print("메뉴를 선택하세요 : ");
            int menu = sc.nextInt();
            int change = money;

            if (menu == 1) {
                if (money >= 2000) {
                    change -= 2000;
                    System.out.println("쌍화차 나왔습니다");
                } else {
                    System.out.println("금액이 부족합니다");
                }
            } else if (menu == 2) {
                if (money >= 1500) {
                    change -= 1500;
                    System.out.println("Dr.Pepper 나왔습니다");
                } else {
                    System.out.println("금액이 부족합니다");
                }
            } else if (menu == 3) {
                if (money >= 1000) {
                    change -= 1000;
                    System.out.println("데자와 나왔습니다");
                } else {
                    System.out.println("금액이 부족합니다");
                }

            } else {
                System.out.println("잘못 입력하셨습니다");
            }
            int change_1000 = change / 1000;
            int change_500 = (change % 1000) / 500;
            int change_100 = (change % 500) / 100;
            int change_50 = (change % 100) / 50;
            int change_10 = (change % 50) / 10;
            int change_5 = (change % 10) / 5;
            int change_1 = (change % 5) / 1;
            System.out.println("잔돈: " + change + " 원");
            System.out.println("천원: " + change_1000 + "장");
            System.out.println("오백원: " + change_500 + " 개");
            System.out.println("백원: " + change_100 + " 개");
            System.out.println("오십원: " + change_50 + " 개");
            System.out.println("십원: " + change_10 + " 개");
            System.out.println("오원: " + change_5 + "개 ");
            System.out.println("일원: " + change_1 + " 개");
        }
    }
