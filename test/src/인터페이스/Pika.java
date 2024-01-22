package 인터페이스;

public class Pika implements Digimon, Pokemon {

	// interface 상속받는 키워드 -> implements 
	// 상속(extends) -> 클래스간의 부모-자식 관계 ->공통되는 필드나 메소드를 추상화하는개념
	// 구현(implements) -> 다중상속 가능 -> 형제 관계 -> 클래스를 확장시켜 다형성을 높힘
	
	
	@Override
	public void attack() {
		System.out.println("피카츄 공격~");
		
	}

	@Override
	public void specialAttack() {
		System.out.println("백만볼트~");
	}
	
	
}
