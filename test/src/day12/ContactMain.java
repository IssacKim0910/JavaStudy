package day12;

import java.util.ArrayList;

public class ContactMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact contact1 = new Contact("김자영", 20, "010-0000-0000");
		Contact contact2 = new Contact("백연주", 20, "010-1111-1111");
		Contact contact3 = new Contact("변지원", 20, "010-2222-2222");
		Contact contact4 = new Contact("강민재", 20, "010-3333-3333");
		Contact contact5 = new Contact("백종호", 20, "010-4444-4444");
		Contact contact6 = new Contact("김수종", 20, "010-5555-5555");

		ArrayList<Contact> contacts = new ArrayList<>();
        
		contacts.add(contact1);
		contacts.add(contact2);
		contacts.add(contact3);
		contacts.add(contact4);
		contacts.add(contact5);
		contacts.add(contact6);

//		System.out.println(contacts.get(0).name);
//		System.out.println(contacts.get(0).age);
//		System.out.println(contacts.get(0).tel);
//		String name = contacts.get(0).name;
//		int age = contacts.get(0).age;
//		String tel = contacts.get(0).tel;

		
	
		for(int i = 0; i< contacts.size(); i ++) {
			String name = contacts.get(i).getName();
			int age = contacts.get(i).getAge();
			String tel = contacts.get(i).getTel();
			
			System.out.printf("%s(%d세) : %s\n", name, age, tel);
		}
	}

}
