package day8;

public class Ex06비정방형배열 {
    public static void main(String[] args) {

        int[][] array = new int[3][];
        array[0] = new int[2];
        array[1] = new int[3];
        array[2] = new int[4];

        int cnt = 1;

//        array[0][0] = cnt;
//        cnt++;
//        array[0][1] = cnt;
//        cnt++;
//
//        array[1][0] = cnt;
//        cnt++;
//        array[1][1] = cnt;
//        cnt++;
//        array[1][2] = cnt;
//        cnt++;
//
//        array[2][0] = cnt;
//        cnt++;
//        array[2][1] = cnt;
//        cnt++;
//        array[2][2] = cnt;
//        cnt++;
//        array[2][3] = cnt;
//        cnt++;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    array[i][j]= cnt;
                    cnt++;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }


    }
}
