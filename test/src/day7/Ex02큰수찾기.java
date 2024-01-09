package day7;

public class Ex02큰수찾기 {
    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 12;
        array[1] = 3;
        array[2] = 9;
        array[3] = 15;
        array[4] = 7;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

    }
}
