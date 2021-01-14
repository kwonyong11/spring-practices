package container.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	
	// Wiring01: 필드 직접주입(CGLib)
	//@Inject // (자바 표준 Wiring Annotation)
	@Autowired
	@Qualifier("highSchoolRapper3Final")
	private CompactDisc cd;
	
	public CDPlayer() {
	}
	
	// Wiring02: 생성자 주입
	// @Autowired
	public CDPlayer(@Qualifier("highSchoolRapper3Final") CompactDisc cd) {
		this.cd = cd;
	}
	
	// Wiring03: setter 주입
	// @Autowired
	public void setCd(@Qualifier("highSchoolRapper3Final") CompactDisc cd) {
		this.cd = cd;
	}
	
	// Wiring04: 일반 메소드 주입
	// @Autowired
	public void insertCd(@Qualifier("highSchoolRapper3Final") CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}

}
