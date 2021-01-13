package container.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import container.user.User;
import container.user.User1;
import container.user.User2;

public class TestXmlConfig {

	public static void main(String[] args) {
		// XML Auto Configuration(Annotation Scanning)
		testBeanFactory01();
		
		// XML Bean Configuration(빈설정, Explicit Configuration)
		testBeanFactory02();
		
		// XML Auto Configuration(Annotation Scanning)
		testApplicationContext01();
		
		// XML Bean Configuration(빈설정, Explicit Configuration)
		testApplicationContext02();
	}

	// XML Bean Configuration(빈설정, Explicit Configuration)
	private static void testApplicationContext02() {
		ApplicationContext ac 
			= new ClassPathXmlApplicationContext("container/config/user/applicationContext02.xml");

		// id로 빈 가져오기
		User user = (User)ac.getBean("user1");
		System.out.println(user);

		// name으로 빈 가져오기
		user = (User)ac.getBean("usr");
		System.out.println(user);
		
		// 1. 1개 파라미터로 생성된 빈 가져오기
		// 2. type으로 빈 가져오기
		//    : 같은 타입의 객체가 2개이상 있으면 에러
		//    : type + id 또는 type + name으로 가져 와야 한다.
		user = ac.getBean("user2", User.class);
		System.out.println(user);

		// 2개 파라미터로 생성된 빈 가져오기1
		user = ac.getBean("user3", User.class);
		System.out.println(user);
		
		// 2개 파라미터로 생성된 빈 가져오기2
		user = ac.getBean("user4", User.class);
		System.out.println(user);

		// 기본 생성자 + setter + DI 적용한 빈 가져오기1
		user = ac.getBean("user5", User.class);
		System.out.println(user);

		// 기본 생성자 + setter + DI 적용한 빈 가져오기2
		user = ac.getBean("user6", User.class);
		System.out.println(user);

		// setter를 사용한 리스트 세팅하기
		user = ac.getBean("user7", User.class);
		System.out.println(user);
		
		// 자원정리
		((ConfigurableApplicationContext)ac).close();		
	}

	// XML Auto Configuration(Annotation Scanning)
	private static void testApplicationContext01() {
		ApplicationContext ac 
			= new ClassPathXmlApplicationContext("container/config/user/applicationContext01.xml");
		
		User1 user1 = ac.getBean(User1.class);
		System.out.println(user1.getName());
		
		// Bean의 id가 자동 생성됨
		user1 = (User1)ac.getBean("user1");
		System.out.println(user1.getName());
		
		// 자원정리
		((ConfigurableApplicationContext)ac).close();
	}
	
	// XML Auto Configuration(Annotation Scanning)
	private static void testBeanFactory01() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("container/config/user/applicationContext01.xml"));
		
		User1 user1 = bf.getBean(User1.class);
		System.out.println(user1.getName());
		
		// Bean의 id가 자동 생성됨
		user1 = (User1)bf.getBean("user1");
		System.out.println(user1.getName());
	}
	
	// XML Bean Configuration(빈설정, Explicit Configuration)
	private static void testBeanFactory02() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("container/config/user/applicationContext02.xml"));
		
		User2 user2 = bf.getBean(User2.class);
		System.out.println(user2.getName());
		
		// 빈설정(Explicit Config)에서는 Bean의 id가 자동으로 설정되지 않음
		// 명시적으로 설정해야 한다.
		user2 = (User2)bf.getBean("user");
		System.out.println(user2.getName());
	}
	
}