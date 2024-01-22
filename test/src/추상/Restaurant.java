package 추상;

import java.util.ArrayList;

public class Restaurant {

	public static void main(String[] args) {

//		Pbkjjajang pbk = new Pbkjjajang();
//		pbk.makeJjajang();
		
		// 업캐스팅 - 자식클래스에서 객체가 생성되었으나
		// 			  부모클래스타입으로 형태가 변환된것
		
		// 부모타입으로 형태가 변환되어도 부모의 메소드를 호추할때
		// 자식클래스에서 재정의 했다면 자식클래스의 재정의한 메소드가 호출된다
		
		
		//첫재
		Pbkjjajang pjw = new PJWjjajang();
		
		// 다운캐스팅 - 부모타입객체가 자식타입으로 변환하는 것
		
		// 부모타입이 자식으로 들어가려면 형 변환
	
		PJWjjajang newPjw = (PJWjjajang)pjw;
		newPjw.makeJjambong();
		
		//둘째
		Pbkjjajang pjy = new PJYjjajang();
		
		//셋째
		Pbkjjajang pdg = new PDGjjajang();
		
		ArrayList<Pbkjjajang> list = new ArrayList<Pbkjjajang>();
		list.add(pjw);
		list.add(pjy);
		list.add(pdg);
		
		
	}

}
