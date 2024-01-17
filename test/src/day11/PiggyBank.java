package day11;

public class PiggyBank {

    //저금통 설계도 클래스

    //Class(설계도, 틀) -> 설계만 하는 것이라서 코드 실행 x     main() 필요 X

    //필드
    // 자본 : money
    int money;

    //메소드
    // 저금 : deposit, 출금 : withdraw, 잔액 : showMoney

    public void deposit(int input) {
        money += input;
        //System.out.println("현재 잔액 : " + money);
    }
    
    public void withdraw(int input) {
        money -= input;
        //System.out.println("현재 잔액 : " + money);
    }

    public void showMoney() {
        System.out.println("잔액 : " + money);
    }
}