package day11;

public class Ex01People {

    // 창조주가 되어서 사람을 만들 수 있는 설계도 만들기
    // 설계도 = class without main method.
    // 클래스 구조
    // 1. 필드 = 속성, 특성, 정의할 수 있는 데이터
    // 이름, 키, 몸무게, 성별...
    String name;
    double height;
    String gender;

    // 2. 메소드
    // 말하기, 걷기, 코딩하기, 잠자기 ...
    // main()가 없는 곳에서는 static keyyword X
    public void talk(){
        System.out.println("말말말말");
    }
    public void coding(){
        System.out.println("구글링");
    }
    public void sleep(){
        System.out.println("zZzZzZz......");
    }
}
