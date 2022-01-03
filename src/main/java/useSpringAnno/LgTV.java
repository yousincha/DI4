package useSpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv1")

public class LgTV implements TV{
	
	@Autowired
	@Qualifier("baewha")
	private Speaker speaker;
	private int price;
	
	public LgTV() {
		System.out.println("LGTV객체 생성");
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker=speaker;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("엘지 전원 켠다. 가격:"+price);
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("엘지 전원 끈다.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		//System.out.println("엘지 소리 높인다.");
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		//System.out.println("엘지소리 내린다.");
		speaker.volumeDown();
	}

}
