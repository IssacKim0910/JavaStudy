package day7;

public class test {
    public static void main(String[] args) {

        int[] star = {3, 4, 4, 2, 1};
        for (int i = 0; i < star.length; i++) {
            for (int k = 1; k <= star[i]; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
