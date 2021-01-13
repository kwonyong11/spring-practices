package container.config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import container.user.User;

@Configuration
public class AppConfig02 {
	@Bean
	public User user2() {
		return new User("마이콜");
	}
}
