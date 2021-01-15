package container.config.videosystem.mixing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 
 * @author javafullstack-bitacademy
 * 
 * Explicit Configuration : Java Configuration
 * 
 * 	   JavaConfig2      <----------- 	 JavaConfig1   +   JavaConfig1
 * (VideoSystemConfig)    [import]	     (DVDConfig)     (DVDPlayerConfig)
 * 
 * Config = JavaConfig2 + Java Config1
 *
 */

@Configuration
@Import({DVDConfig.class, DVDPlayerConfig.class})
public class VideoSystemConfig {
}
