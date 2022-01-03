package useSpring;

public class BaewhaSpeaker implements Speaker{
	//1.생성자 메소드
	public BaewhaSpeaker() {
		System.out.println("배화 스피커 객체 생성");
	}
	//2.volumeUp메소드
	public void volumeUp() {
		System.out.println("배화 스피커 소리 올린다.");
	}
	//3.volumeUp메소드
	public void volumeDown() {
		System.out.println("배화 스피커 소리 내린다.");
	}
}
