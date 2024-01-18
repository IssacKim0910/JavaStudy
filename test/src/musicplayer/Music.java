package musicplayer;

public class Music {
	// Class 는 내가 저장하고싶은 데이터를 저장할 수 있는 데이터 타입.

	// Fields = 전역변수
	private String singer; // 가수
	private String title; // 제목
	private int time; // 시간
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	

}
