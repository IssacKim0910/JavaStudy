package day5;

public class Ex12완전수 {
    public static void main(String[] args) {
            //어려워
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            sum = 0;
            for (int j = 1; j <i; j++) {
                if (i % j == 0) {
                    sum += j; //sum = 1
                }
            }
            if (sum == i)
                System.out.println(i);
        }
    }
}
