/**
 *
 */
package com.springinaction.chapter4.concert.test;

import com.springinaction.chapter4.concert.config.ConcertConfig;
import com.springinaction.chapter4.concert.main.Encoreable;
import com.springinaction.chapter4.concert.main.Performance;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author MonkGirl
 *
 */
@SpringJUnitConfig(classes = ConcertConfig.class)
public class TestAspect {

    @Autowired
    private Performance performance;

    @Test
    public void testAspect() {
        performance.perform();
        Encoreable encoreable = (Encoreable) performance;
        encoreable.performEncore();
    }

}
