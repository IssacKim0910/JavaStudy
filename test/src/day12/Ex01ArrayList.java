package day12;

import java.util.ArrayList;

public class Ex01ArrayList {

	public static void main(String[] args) {

		// 1. 선언 및 생성
		// 배열
		int[] arr = new int[5];

		// ArrayList(가변리스트)
		// ArrayList<데이터타입> 변수명 = new ArrayList<>();
		// ArrayList는 import 해야 사용 가능
		ArrayList<Integer> arrList = new ArrayList<>();

		System.out.println("배열의 길이 : " + arr.length);
		System.out.println("ArrayList의 길이 : " + arrList.size());

		// 2. 값 추가
		// 배열
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;

		// ArrayList -> 변수명.add(값) : 순차적으로 인덱스에 추가
		// 				변수명.add(Index, 값)
		arrList.add(0);
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		System.out.println("값 추가 후 ArrayList의 길이 : " + arrList.size());
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");		//인덱스 값을 추출하려면 get
		}
		System.out.println();
		// 3. 값 삭제 -> 변수명.remove(인덱스) or 변수명.(값)
		arrList.remove(0);
		System.out.println(arrList.get(0));
		System.out.println("삭제후 길이 : " + arrList.size());
						
		arrList.clear();	//값 모두 삭제 -> removeAll() or clear()
		
		System.out.println("clear후 크기 : " + arrList.size());
	
	}

}
