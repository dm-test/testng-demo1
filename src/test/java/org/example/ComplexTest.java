package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class ComplexTest {
    private static final Logger LOG = LoggerFactory.getLogger(ComplexTest.class);

    @Test
    public void complexTest1() {
        LOG.info("Test complete!");
    }

    @Test
    public void complexTest2() {
        LOG.info("Test complete!");
    }
}
