package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class ComplexTest extends AbstractTest {
    private static final Logger LOG = LoggerFactory.getLogger(ComplexTest.class);

    @BeforeClass
    public void beforeComplexTestClass() {
        LOG.info("Before class ComplexTest");
    }

    @AfterClass
    public void afterComplexTestClass() {
        LOG.info("After class ComplexTest");
    }

    @BeforeMethod
    public void beforeComplexTestMethod() {
        LOG.info("Before ComplexTest method");
    }

    @AfterMethod
    public void afterComplexTestMethod() {
        LOG.info("After ComplexTest method");
    }

    @Test
    public void complexTest1() {
        LOG.info("complexTest1 complete!");
    }

    @Test
    public void complexTest2() {
        LOG.info("complexTest2 complete!");
    }
}
