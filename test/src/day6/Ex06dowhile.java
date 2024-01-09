package day6;

public class Ex06dowhile {
    public static void main(String[] args) {

        int treeHp = 100;
        int axPower = 50;

        do {
            treeHp -= axPower;
            System.out.println("으씨야앗");
        } while (treeHp > 0);


    }
}
