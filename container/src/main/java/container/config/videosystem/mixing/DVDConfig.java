package container.config.videosystem.mixing;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import container.videosystem.Avengers;
import container.videosystem.BlankDisc;
import container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDConfig {
	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}
	
	@Bean("avengersExpansionPack1")
	public DigitalVideoDisc blankDisc() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Avengers Expansion Pack1");
		blankDisc.setStudio("Marvel");
		blankDisc.setActors(Arrays.asList(new String[] {"Robert Downey Jr.","Scarett","Chris Evans"}));
		
		return blankDisc;
	}
}
