package day7;

import java.util.Scanner;

public class Ex06팀원찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] team = {"김동혁", "백종호", "조승혁", "김민학"};

        System.out.print("팀원 이름을 입력해주세요>>");
        String name = sc.next();
        int i = 0;
        boolean isCheck = true;         // boolean 타입 만들어서 비교
        for (i = 0; i < team.length; i++) {
            if (team[i].equals(name)) {
                System.out.println(name + "은 " + (i + 1) + " 번째 위치에 존재합니다");
                //isCheck = false;
                break;

            } else if (i == team.length - 1) {            //if문을 끝까지 실행해서 못찾으면  i=4가 되는데 4== 5-1 은 같기에 실행
                System.out.println("존재하지않습니다");
            }
        }
//        if (isCheck) {                        //처음코드는 !name.equals(team[i])를 해봤는데 배열의 길이때문에 에러발생
//            System.out.println("존재하지않습니다"); //
//        }


    }
}