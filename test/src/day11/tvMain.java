package day11;

public class tvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv = new Tv();
		
		tv.channel = 5;
		tv.color = "red";
		
		tv.channel1Up();
		tv.channel1Up();
		tv.channel1Down();
		
		
		System.out.println("채널번호 : " + tv.channel);
		System.out.println("채널색깔 : " + tv.color);
	}

}
