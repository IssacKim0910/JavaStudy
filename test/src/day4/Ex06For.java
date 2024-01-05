package day4;

public class Ex06For {
    public static void main(String[] args) {
        // printf: print format
        // 정수 : %d (decimal)
        // 엔터(개행) : %n(new)
        // 실수 : %f (floating)
        // 문자열 : %s (String)

        String name = "김동혁";
        int age = 21;
        System.out.printf("안녕하세요 저는 %s입니다 나이는 %d살입니다 %n", name, age);
        System.out.printf("오늘 비가 올 확률은 %.1f%%입니다%n", 30.5);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("2 x %d = %d%n", i, 2 * i);
            System.out.println("2 x " + i + " = " + i * 2);
        }

    }
}
