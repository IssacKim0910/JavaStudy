package day11;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student("홍길동","19900216",19,90,60,100);
		
		s1.name = "이주희";
		s1.number = "20201025";
		s1.age = 20;
		s1.scoreJava = 60;
		s1.scoreWeb = 55;
		s1.scoreAndroid = 45;	
		
		s1.show();
		s2.show();
//		s2.name = "홍길동";
//		s2.number = "19900216";
//		s2.age = 19;
//		s2.scoreJava = 90;
//		s2.scoreWeb = 60;
//		s2.scoreAndroid = 100;
	}
	}