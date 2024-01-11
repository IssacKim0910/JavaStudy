package day7;

public class Ex08돌아온별찍기 {
    public static void main(String[] args) {

        int[] star = {3, 4, 4, 2, 1};
        for (int i = 0; i < star.length; i++) {
            System.out.print(star[i]+" : ");

            for (int j = 0; j < star[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
