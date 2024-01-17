package day11;

public class PiggyBankMain {
    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank();

        pb.deposit(1500);
        pb.deposit(700);
        pb.withdraw(500);
        pb.showMoney();
    }
}

