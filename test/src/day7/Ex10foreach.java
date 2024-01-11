package day7;

public class Ex10foreach {
    public static void main(String[] args) {
        String[] foods = {"광어", "우럭", "참치", "삼치", "수육", "족발", "곱창"};

        //배열안에 모든 인덱스에 접근할때는 for each를 쓰는게 편리
        for(String food : foods){
            System.out.println(food);
        }


    }
}
