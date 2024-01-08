package day5;

public class Ex11약수 {

    public static void main(String[] args) {

        for (int i = 2; i <= 30; i++) {
            System.out.print("\n" + i + "의 약수 :");
            for (int j = 1; j <= 30; j++) {
                if (i % j == 0) {

                    System.out.print(j + " ");
                }
            }
        }
    }
}