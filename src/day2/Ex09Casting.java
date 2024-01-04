package day2;

public class Ex09Casting {
    public static void main(String[] args) {

        // 자료 형 변환 (Data Type Casting)
        int weight = 78;
        //78.0 으로 출력하고 싶다
        // 정수 타입 -> 실수 타입으로 변환

        //묵시적 형 변환(Implicit Type Casting)
        double cvt_weight = weight;
        System.out.println(cvt_weight);

        final double PI = 3.141592;
        //명시적 형 변환 (Explicit Type Casting)
        final int CVT_PI = (int)PI;
        System.out.println(CVT_PI);

    }
}
