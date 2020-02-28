package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ThreadTest {
    private static final Logger LOG = LoggerFactory.getLogger(ThreadTest.class);

    @Test
    public void simpleTest1() throws InterruptedException {
        long id = Thread.currentThread().getId();
        TimeUnit.SECONDS.sleep(2);
        LOG.info("simpleTest1 complete! Thread id = {}", id);
    }

    @Test
    public void simpleTest2() throws InterruptedException {
        long id = Thread.currentThread().getId();
        TimeUnit.SECONDS.sleep(2);
        LOG.info("simpleTest2 complete! Thread id = {}", id);
    }

    @Test
    public void simpleTest3() throws InterruptedException {
        long id = Thread.currentThread().getId();
        TimeUnit.SECONDS.sleep(2);
        LOG.info("simpleTest3 complete! Thread id = {}", id);
    }

    @Test
    public void simpleTest4() throws InterruptedException {
        long id = Thread.currentThread().getId();
        TimeUnit.SECONDS.sleep(2);
        LOG.info("simpleTest4 complete! Thread id = {}", id);
    }

    @Test
    public void simpleTest5() throws InterruptedException {
        long id = Thread.currentThread().getId();
        TimeUnit.SECONDS.sleep(2);
        LOG.info("simpleTest5 complete! Thread id = {}", id);
    }
}
