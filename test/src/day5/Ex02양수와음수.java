package day5;

public class Ex02양수와음수 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(" " + i + " ");
            } else {
                System.out.print(i * -1);
            }
//            if (i % 2 == 0) {
//                System.out.print(i * -1 + " ");
//            } else {
//                System.out.print(i + " ");
//            }
        }
    }
}