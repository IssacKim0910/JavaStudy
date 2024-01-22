package Maple;

public class Archer extends BasicCharacter {

	@Override
	public void attack() {
		System.out.println("애로우블로우");
	}

	@Override
	public void avoid() {
		System.out.println("튀기");
	}

	@Override
	public void move() {
		System.out.println("움직여");
	}

}
