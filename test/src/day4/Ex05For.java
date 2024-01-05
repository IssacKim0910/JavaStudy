package day4;

public class Ex05For {
    public static void main(String[] args) {

        for (int i = 21; i <= 57; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 22; i <= 57; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 21; i <= 57; i++) {
            System.out.print(78 - i + " ");
        }
    }
}