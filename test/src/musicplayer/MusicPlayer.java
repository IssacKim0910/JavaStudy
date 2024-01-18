package musicplayer;


public class MusicPlayer {

	public static void main(String[] args) {
		// 뮤직 플레이어
		
		// 노래정보 - 가수(String), 제목(String), 시간초(int)
		// 내가 원하는 클래스를 만든다 클래스=데이터타입
		
		// 노래객체 하나 생성
		Music m1 = new Music(); 
		m1.setSinger("뉴진스");
		m1.setTitle("OMG");
		m1.setTime(183);
		
		System.out.println(m1.getSinger());
		System.out.println(m1.getTitle());
		System.out.println(m1.getTime());
		
		// 객체지향 특징4가지
		// 캡슐화
	}

}
