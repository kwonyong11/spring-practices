package container.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:container/config/videosystem/DVDPlayerConfig.xml"})
public class DVDPlayerXMLConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
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
	
	@Autowired
	@Qualifier("avengersAgeOfUltron")
	private DigitalVideoDisc dvd05;
	
	@Autowired
	@Qualifier("captainAmerica")
	private DigitalVideoDisc dvd06;
	
	@Autowired
	@Qualifier("avengersDirectorEdition")
	private DigitalVideoDisc dvd07;
	
	@Autowired
	@Qualifier("avengersExpansionPack1")
	private DigitalVideoDisc dvd08;
	
	@Autowired
	@Qualifier("avengersExpansionPack2")
	private DigitalVideoDisc dvd09;
	
	@Autowired
	@Qualifier("avengersExpansionPack3")
	private DigitalVideoDisc dvd10;
	
	@Autowired
	@Qualifier("avengersTriplePack")
	private DVDPack dvdPack;
	
	
	@Autowired
	@Qualifier("dvdPlayer01")
	private DVDPlayer dvdPlayer01;
	
	@Autowired
	@Qualifier("dvdPlayer02")
	private DVDPlayer dvdPlayer02;
	
	@Autowired
	@Qualifier("dvdPlayer03")
	private DVDPlayer dvdPlayer03;
	
	@Autowired
	@Qualifier("dvdPlayer04")
	private DVDPlayer dvdPlayer04;
	
	@Autowired
	@Qualifier("dvdPlayer05")
	private DVDPlayer dvdPlayer05;
	
	
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
	
	@Test
	public void testDVD05NotNull() {
		assertNotNull(dvd05);
	}
	
	@Test
	public void testDVD06NotNull() {
		assertNotNull(dvd06);
	}
	
	@Test
	public void testDVD07NotNull() {
		assertNotNull(dvd07);
	}
	
	@Test
	public void testDVD08NotNull() {
		assertNotNull(dvd08);
	}
	
	@Test
	public void testDVD09NotNull() {
		assertNotNull(dvd09);
	}
	
	@Test
	public void testDVD10NotNull() {
		assertNotNull(dvd10);
	}
	
	@Test
	public void testDVDPackNotNull() {
		assertNotNull(dvdPack);
	}
	
	
	@Test
	public void testPlay01() {
		dvdPlayer01.play();
		assertEquals("playing movie Marvel's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay02() {
		dvdPlayer02.play();
		assertEquals("playing movie Marvel's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay03() {
		dvdPlayer03.play();
		assertEquals("playing movie Marvel's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay04() {
		dvdPlayer04.play();
		assertEquals("playing movie Marvel's Avengers Director's Edition", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay05() {
		dvdPlayer05.play();
		assertEquals("playing movie Marvel's Avengers Director's Edition", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
}
