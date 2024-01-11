package day8;

public class Ex03지그재그 {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = num;
                    num++;
                }
            } else {
                for (int k = array[i].length - 1; k >= 0; k--) {
                    array[i][k] = num;
                    num++;
                }
            }
        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
        for (int[] f : array) {
            if (f % 2 == 0) {
                for (int s : f) {
                    System.out.print(s + " ");
                }
            }
            System.out.println();
        }
    }
}


