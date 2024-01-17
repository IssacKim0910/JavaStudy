package day11;

public class People {

    // 창조주가 되어서 사람을 만들 수 있는 설계도 만들기
    // 설계도 = class without main method.
    // 클래스 구조
    // 1. 필드 = 속성, 특성, 정의할 수 있는 데이터
    // 이름, 키, 몸무게, 성별...
    String name;
    double height;
    String gender;
    // 생성자 메소드(default constructor, 기본 생성자)
    // 생성자가 없는 클래스는 X
    // 기본 생성자 메소드 이외의 또다른 생성자 메소드를 만들면 사라짐
    // 리턴타입X (void 자체도 없음)
    // 생성자 메소드 이름 = 클래스 이름
    // 생성자 메소드도 오버로딩이 가능
    public People(){

    }

    //this -> 현재 메소드가 존재하는 클래스의 필드값을 가리킴
    public People(String name, double height, String gender) {
        this.name = name;
        this.height = height;
        this.gender = gender;
    }


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
