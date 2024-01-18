package day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> team = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			team.add(name);
		}
		System.out.print("김동혁의 팀원은 ");
		for (int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + " "); 
		}
		System.out.print("입니다");

	}

}
