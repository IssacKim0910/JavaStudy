package day9;

public class Ex02메소드2 {
    public static void main(String[] args) {
    sumPrint(4,7);

    }


    private static void sumPrint(int a, int b) {            //매개변수 없고 반환값 있음
        int result = a + b;
        System.out.println("두 수의 합은 " + result + " 입니다");
    }

}
