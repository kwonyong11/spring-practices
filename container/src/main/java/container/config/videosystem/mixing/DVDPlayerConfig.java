package container.config.videosystem.mixing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import container.videosystem.DVDPlayer;
import container.videosystem.DigitalVideoDisc;


/**
 * 
 * @author javafullstack-bitacademy
 * 
 * Explicit Configuration : Java Configuration
 * 
 * 	   JavaConfig2    <----------- 	 JavaConfig1
 * (DVDPlayerConfig)   [import]		 (DVDConfig)
 * 
 * Config = JavaConfig2 + Java Config1
 *
 */

@Configuration
@Import({DVDConfig.class})
public class DVDPlayerConfig {
	@Bean
	public DVDPlayer dvdPlayer(@Qualifier("avengersExpansionPack1") DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
}
