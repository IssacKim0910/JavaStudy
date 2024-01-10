package day7;

public class Ex04총합과평균그리고짝수 {
    public static void main(String[] args) {

        int[] array = {55, 57, 56, 12, 13, 9, 8, 11, 72, 99, 24, 11, 3};
        int sum = 0;
        double avg = 0;
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        avg = (double) sum / array.length;

        System.out.println("총합 : " + sum);
        System.out.println("평균 :" + avg);
        System.out.println("짝수개수 : " + even);

    }
}
