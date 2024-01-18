package day12;

public class Contact {
	
	private String name;
	private int age;
	private String tel;
	
	public Contact() {
		
	}
	
	// getter 메소드
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getTel() {
		return tel;
	}
	
	
	// 생성자 메소드
	public Contact(String name, int age, String tel) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	
	
	
}
