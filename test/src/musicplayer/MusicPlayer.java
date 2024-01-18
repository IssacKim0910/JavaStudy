package musicplayer;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

    public static void main(String[] args) {
        // 뮤직 플레이어

        // 노래정보 - 가수(String), 제목(String), 시간초(int)
        // 내가 원하는 클래스를 만든다 클래스=데이터타입
        // 객체 = 레퍼런스 변수
        // 데이터타입 변수명 = new 데이터타입();
        // 노래객체 하나 생성
        Music m1 = new Music("뉴진스", "omg", 183);
        Music m2 = new Music("아이유", "금요일에 만나요", 170);
        Music m3 = new Music("박재정", "헤어지자말해요", 181);
        Music m4 = new Music("DK디셈버)", "심", 190);
        Music m5 = new Music("그대가내안에박혔다", "황치열", 199);

        ArrayList<Music> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);

        Scanner sc = new Scanner(System.in);

        int point = 0;
        while (true) {
            System.out.print("1.목록 2.재생 3.이전곡 4.다음곡 5.종료 >> ");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("====== 노래List ======");

                for (int i = 0; i < list.size(); i++) {
                    System.out.print(i + 1 + "." + list.get(i).getSinger() + "-");
                    System.out.print(list.get(i).getTitle() + "(");
                    System.out.println(list.get(i).getTime() + "초)");
                }

            } else if (menu == 2) {
                System.out.println("======= 재생 ======");
                System.out.print(point + 1 + "." + list.get(point).getSinger() + "-");
                System.out.print(list.get(point).getTitle() + "(");
                System.out.println(list.get(point).getTime() + "초)");

            } else if (menu == 3) {
                System.out.println("====== 이전곡 ======");
                if (point > 0) {
                    point--;
                    System.out.print(point + 1 + "." + list.get(point).getSinger() + "-");
                    System.out.print(list.get(point).getTitle() + "(");
                    System.out.println(list.get(point).getTime() + "초)");
                } else {
                    System.out.println("이전곡이 없습니다.");
                }
            } else if (menu == 4) {
                System.out.println("====== 다음곡 ======");
                // 2.아이유 - 금요일에만나요
                if (point < list.size() - 1) {
                    ++point;
                    System.out.print(point + 1 + "." + list.get(point).getSinger() + "-");
                    System.out.print(list.get(point).getTitle() + "(");
                    System.out.println(list.get(point).getTime() + "초)");
                } else {
                    System.out.println("다음곡이 없습니다.");
                }

            } else if (menu == 5) {
                System.out.println("프로그램을 종료합니다...");
                break;
            } else {
                System.out.println("정확한 숫자를 입력해주세요.");
            }

        }
        // 객체지향 특징4가지
        // 캡슐화
        // 상속
        // 추상화
        // 다형성

    }
}