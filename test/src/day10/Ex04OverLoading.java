package day10;

public class Ex04OverLoading {
    public static void main(String[] args) {


        //메소드 오버로딩
        // 1. 메소드 이름은 동일
        // 2. 메소드 구별 -> 매개변수 개수, 매개변수 데이터 타입

        add(5, 9);
        add(1.5, 6);
        add(2.3, 5, 6.9);
        System.out.println(add(5.1,5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, int b) {
        return a + b;
    }

    public static double add(double a, int b, double c) {
        return a + b + c;
    }

}