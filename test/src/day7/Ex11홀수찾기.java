package day7;

public class Ex11홀수찾기 {
    public static void main(String[] args) {
        int count = 0;
        int[] array = {1, 9, 6, 8, 12, 15, 16, 18, 22, 27, 31, 35, 40};
        for (int odd : array) {
            if (odd % 2 == 1) {
                count++;
            }
        }
        System.out.println("홀수개수: " + count);
    }
}
