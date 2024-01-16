package day8;

public class Ex05forEach {
    public static void main(String[] args) {

        String[][] list = {
                          {"박병관", "황해도", "정봉균"},
                          {"선영표", "최영화", "김미희"}
                          };

        for (String[] names : list){
            for(String name: names){
                System.out.print(name+" ");
            }
            System.out.println();
        }

    }
}
