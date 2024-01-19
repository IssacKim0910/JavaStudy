package 상속2;

public class PhoneMain {
    public static void main(String[] args) {

        SmartPhone sp = new SmartPhone();
        PayPhone pp = new PayPhone();

        pp.call();
        pp.callBack();
        pp.coin();
        System.out.println();

        sp.call();
        sp.call(2);
        sp.playMusic();
        sp.interNet();

    }
}
