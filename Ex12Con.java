package day3;

public class Ex12Con {
    public static void main(String[] args) {

        // 다중 if 문

        int score = 60;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        }
        else {
            System.out.println("F");
        }
    }
}
