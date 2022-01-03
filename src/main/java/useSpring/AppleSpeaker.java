package useSpring;

public class AppleSpeaker implements Speaker{

	public AppleSpeaker() {
		System.out.println("applespeaker 객체 생성");
	}
	public void volumeUp() {
	System.out.println("Apple스피커 소리 높힌다.");
}
    public void volumeDown() {
	System.out.println("Apple스피커 소리 내린다.");
}
}
