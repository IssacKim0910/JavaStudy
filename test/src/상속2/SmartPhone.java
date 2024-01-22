package 상속2;

public class SmartPhone extends Phone {
    public void playMusic() {
        System.out.println("음악 재생");

    }

    public void interNet() {
        System.out.println("인터넷 실행");

    }
    
//    @Override // @ -> 어노테이션: 주석인데 기능을 하는 주석
//    public void call() {
//        System.out.println("부모클래스 상속받은 call");
//    }
    @Override
    public void call() {
    	System.out.println("오버라이딩 된 call");
    	// super.call(); super-> 상위
    }
    //오버라이딩 된 메소드가X (매개변수 다름)

    public void call(int a) {
        System.out.println("영상통화 걸기!");
    }
}

