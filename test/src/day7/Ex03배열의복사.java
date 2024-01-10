package day7;

public class Ex03배열의복사 {
    public static void main(String[] args) {

        //배열을 만드는 두번째 방법  길이와값을 알고있어야함
        int[] array1 = {100, 200, 300};
        int[] array2 = array1;

        System.out.println(array2[0]);

        array2[0] = 999;
        System.out.println(array2[0]);
        System.out.println(array1[0]); 
    }
}
