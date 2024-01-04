package day2;

public class Ex12Opr {
    public static void main(String[] args) {

        int num = 456;
        int num2 = 111;
        int num3 = 1234;
        System.out.println((num/100)*100);
        System.out.println((num2/100)*100);
        System.out.println((num3/100)*100);

        System.out.println(num-(num%100));
        System.out.println(num/100 + "00");
    }
}
