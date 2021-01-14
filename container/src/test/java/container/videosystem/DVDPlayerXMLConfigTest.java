package container.videosystem;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:container/config/videosystem/DVDPlayerConfig.xml"})
public class DVDPlayerXMLConfigTest {
	
	// @Autowired
	// 예외발생
	// XML Bean 설정에서는 id는 자동으로 부여되지 않는다.
	private DigitalVideoDisc dvd01;
	
	@Autowired
	@Qualifier("ironMan")
	private DigitalVideoDisc dvd02;
	
	@Autowired
	@Qualifier("avengersInfinityWar")
	private DigitalVideoDisc dvd03;
	
	@Autowired
	@Qualifier("avengersEndGame")
	private DigitalVideoDisc dvd04;
	
	@Test
	public void testDVD01Null() {
		assertNull(dvd01);
	}
	
	@Test
	public void testDVD02NotNull() {
		assertNotNull(dvd02);
	}
	
	@Test
	public void testDVD03NotNull() {
		assertNotNull(dvd03);
	}
	
	@Test
	public void testDVD04NotNull() {
		assertNotNull(dvd04);
	}
}
