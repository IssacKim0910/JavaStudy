package day9;

public class Ex05계산기 {
    public static void main(String[] args) {

        System.out.println(add(3, 5));
        System.out.println(sub(3, 5));
        System.out.println(mul(3, 5));
        System.out.println(div(3, 5));
    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int mul(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int div(int a, int b) {
        int result = a / b;
        return result;
    }

}
