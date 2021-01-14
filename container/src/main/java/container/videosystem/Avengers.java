package container.videosystem;

public class Avengers implements DigitalVideoDisc {
	private String title = "Avengers";
	private String studio = "Marvel";
	
	@Override
	public void play() {
		System.out.println("playing movie "+studio+"'s "+title);
	}

}
