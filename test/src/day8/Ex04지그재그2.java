package day8;

public class Ex04지그재그2 {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array.length; j++) {
                    array[j][i] = num;
                    num++;
                }
            } else {
                for (int k = array.length - 1; k >= 0; k--) {
                    array[k][i] = num;
                    num++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();


        }

    }
}