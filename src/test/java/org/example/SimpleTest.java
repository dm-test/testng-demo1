package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SimpleTest extends AbstractTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

//    @BeforeClass
//    public void beforeSimpleTestClass() {
//        LOG.info("Before class SimpleTest");
//    }
//
//    @AfterClass
//    public void afterSimpleTestClass() {
//        LOG.info("After class SimpleTest");
//    }
//
//    @BeforeMethod(alwaysRun = true)
//    public void beforeSimpleTestMethod() {
//        LOG.info("Before SimpleTest method");
//    }
//
//    @AfterMethod
//    public void afterSimpleTestMethod() {
//        LOG.info("After SimpleTest method");
//    }
    
    @Test(enabled = false, groups = {"smoke", "simple"})
    public void simpleTest1() {
        LOG.info("simpleTest1 complete!");
    }

    @Test(enabled = false)
    public void simpleTest2() {
        LOG.info("simpleTest2 complete!");
    }

    @DataProvider(name = "Имена")
    private Object[][] dataProvider() {
        return new Object[][]{
                {"Vasily", 46},
                {"Ilya", 30},
                {"Valery", 25}
        };
    }

    @Test(dataProvider = "Имена")
    public void paramTest1(String name, int age) {
        String output = String.format("Name: '%s | Age: '%d'", name, age);
        LOG.info(output);
    }
}
