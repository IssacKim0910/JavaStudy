package Maple;

public class Thief extends BasicCharacter {
	
	@Override
	public void attack() {
		System.out.println("세비지블로우");
	}

	@Override
	public void avoid() {
		System.out.println("피하기");
	}

	@Override
	public void move() {
		System.out.println("헤이스트");
	}

}
