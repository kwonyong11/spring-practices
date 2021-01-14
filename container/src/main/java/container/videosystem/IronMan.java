package container.videosystem;

public class IronMan implements DigitalVideoDisc {
	private String title = "IronMan";
	private String studio = "Marvel";
	
	@Override
	public void play() {
		System.out.println("playing movie "+studio+"'s "+title);
	}

}
