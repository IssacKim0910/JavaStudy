package day8;

public class Ex01이차원배열 {
    public static void main(String[] args) {
        int[][] array = new int[3][4];

        int cnt = 1; //이차원 배열안에 저장될 값
//        array[0][0] = cnt;
//        cnt++;
//        array[0][1] = cnt;
//        cnt++;
//        array[0][2] = cnt;
//        cnt++;
//        array[0][3] = cnt;
//        cnt++;
//
//        array[1][0] = cnt;
//        cnt++;
//        array[1][1] = cnt;
//        cnt++;
//        array[1][2] = cnt;
//        cnt++;
//        array[1][3] = cnt;
//        cnt++;
//
//        array[2][0] = cnt;
//        cnt++;
//        array[2][1] = cnt;
//        cnt++;
//        array[2][2] = cnt;
//        cnt++;
//        array[2][3] = cnt;
//        cnt++;®

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = cnt;
                cnt++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
