package container.user;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import container.config.user.AppConfig01;

public class JavaConfigTest {
	@Test
	public void testJavaConfig01() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig01.class);
		
		User user = ac.getBean(User.class);
		assert(user != null);
		
		// 자원정리
		((ConfigurableApplicationContext)ac).close();
	}
	
	@Test
	public void testJavaConfig02() {
		ApplicationContext ac = new AnnotationConfigApplicationContext("container.config.user");
		
		User user = ac.getBean(User.class);
		assert(user != null);
		
		// 자원정리
		((ConfigurableApplicationContext)ac).close();
	}
}
