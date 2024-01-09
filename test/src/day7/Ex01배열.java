package day7;

public class Ex01배열 {
    public static void main(String[] args) {
        //배열
        // - 동일한 자료가 순차적으로 저장된 것
        // - 저장된 데이터를 가져오거나 넣기 위해 번호 매김 (인덱스)
        // - 인덱스는 0부터 시작하고 길이는 1부터 시작한다
        // - 배열의 길이는 배열을 생성할 때 지정하며 변경할 수 없다.


        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 1; i <= array.length; i++) {
            System.out.println(array[i - 1]);
        }
    }
}
