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
		
		// 팀원 퇴출시키기
		// 1. 퇴출할 팀원 이름 입력
		// 2. team ArrayList의 0 ~ 마지막 인덱스를 검사한 후
		//내가 입력한 팀원이 있으면 삭제한후 다시 팀원 출력
		System.out.println();
		System.out.print("퇴출시킬 팀원 : ");
		String getOut = sc.next();
	
		for(int i = 0; i < team.size(); i++) {
			if(team.get(i).equals(getOut)) {
		team.remove(getOut);
		break;
			}
		}
		System.out.print("김동혁의 팀원은 ");
		for (int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + " "); 
		} 
		System.out.print("입니다");	
	}

}
