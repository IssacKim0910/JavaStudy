package Maple;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MapleRand {
	public static void main(String[] args) {
		// 캐릭터 - 도적, 전사, 마법사, 궁수
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		Warrior w = new Warrior();
		Thief f = new Thief();
		Wizard m = new Wizard();
		Archer a = new Archer();

//		BasicCharacter ww = new Warrior();
//		BasicCharacter ff = new Thief();
//		BasicCharacter mm = new Wizard();
//		BasicCharacter aa = new Archer();

		ArrayList<BasicCharacter> list = new ArrayList<BasicCharacter>();

		list.add(new Warrior());
		list.add(new Thief());
		list.add(new Wizard());
		list.add(new Archer());

//		attack.add(ww);
//		attack.add(ff);
//		attack.add(mm);
//		attack.add(aa);

		while (true) {
			System.out.print("1.공격 2.회피 3.이동 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {

				list.get(rd.nextInt(list.size())).attack();
			} else if (menu == 2) {
				list.get(rd.nextInt(list.size())).avoid();

			} else if (menu == 3) {
				list.get(rd.nextInt(list.size())).move();

			}
		}
	}

}
