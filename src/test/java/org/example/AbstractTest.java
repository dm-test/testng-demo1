package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class AbstractTest {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractTest.class);

//    @BeforeSuite
//    public void beforeSuite1() {
//        LOG.info("beforeSuite1");
//    }
//
//    @BeforeSuite(dependsOnMethods = "beforeSuite1")
//    public void beforeSuite2() {
//        LOG.info("beforeSuite2");
//    }
//
//    @AfterSuite(dependsOnMethods = "afterSuite2")
//    public void afterSuite1() {
//        LOG.info("afterSuite1");
//    }
//
//    @AfterSuite
//    public void afterSuite2() {
//        LOG.info("afterSuite2");
//    }
}
