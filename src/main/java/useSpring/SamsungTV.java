package useSpring;

public class SamsungTV implements TV{

	
	private Speaker speaker;

	private int price;
	
	public SamsungTV() {
		// TODO Auto-generated method stub
		System.out.println("삼성 티비 객체 생성1");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("삼성 티비 객체 생성2");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("삼성 티비 객체 생성3");
		this.speaker = speaker;
		this.price = price;
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성 전원 켠다.(가격:"+price+")");
	}

	
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성 전원 끈다.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		speaker.volumeDown();
	}

}
