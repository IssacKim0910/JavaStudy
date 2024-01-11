package day7;

public class Ex09BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 6, 7};
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }

        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

    }
}
