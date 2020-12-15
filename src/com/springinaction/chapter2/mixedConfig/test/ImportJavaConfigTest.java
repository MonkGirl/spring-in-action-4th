/**
 *
 */
package com.springinaction.chapter2.mixedConfig.test;

import com.springinaction.chapter2.mixedConfig.xmlImportJava.Police;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author MonkGirl
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/com/springinaction/chapter2/mixedConfig/resources/police-config.xml")
//@ContextConfiguration(classes=PoliceConfig.class)
public class ImportJavaConfigTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

//	@Autowired
//	private MediaPlayer player;
//	
//	@Test
//	public void play() {
//		player.play();
//		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n", log.getLog());
//	}

    @Autowired
    private Police police;

    @Test
    public void work() {
        police.work();
    }
}
