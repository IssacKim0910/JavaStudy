package day2;

public class ex {
    public static void main(String[] args) {
        String str = "string";
        String str2 = "string";
        String str3 = new String("string");

        System.out.println(System.identityHashCode(str)); 	//result:356573597
        System.out.println(System.identityHashCode(str2));	//result:356573597
        System.out.println(System.identityHashCode(str3));
        System.out.println(str == str2);
        System.out.println(str2 == str3);
    }
}
