package container.soundsystem;

import org.springframework.stereotype.Component;

//@Named("hsRapper3Final")
//@Component("hsRapper3Final")
@Component
public class HighSchoolRapper3Final implements CompactDisc {
	private String title="지구멸망";
	private String artist="양승호";
	
	@Override
	public void play() {
		System.out.println("playing " + title + " by "+artist);
	}

}
