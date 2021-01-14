package container.videosystem;

public class BlankDisc implements DigitalVideoDisc {
	private String title;
	private String studio;
	
	public BlankDisc(String title, String studio) {
		this.title = title;
		this.studio = studio;
	}
	
	@Override
	public void play() {
		System.out.println("playing movie "+studio+"'s "+title);
	}

}
