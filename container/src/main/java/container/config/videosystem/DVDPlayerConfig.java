package container.config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import container.videosystem.DVDPlayer;
import container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDPlayerConfig {
	
	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	
	// 주입하기1: : setter 주입 : 파라미터로 Bean 전달하기
	@Bean
	public DVDPlayer dvdplayer(DigitalVideoDisc dvd) {	
		DVDPlayer dvdPlayer = new DVDPlayer();
		dvdPlayer.setDvd(dvd);
		
		return dvdPlayer;
	}
}
