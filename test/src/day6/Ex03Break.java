package day6;

public class Ex03Break {
    public static void main(String[] args) {

        int cnt = 0;

        while (true) {
            cnt++;
            System.out.println (cnt + "안녕!");
            if (cnt == 10)
                break;
        }
    }
}
