package com.standard.app;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Quan Pham (mquan86@gmail.com)
 * 
 */
public class AppTest {
    private static final Logger log = LoggerFactory.getLogger(AppTest.class);

    @BeforeClass
    public static void setUpBeforeClass() {
        log.info("setUpBeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        log.info("tearDownAfterClass");
    }

    @Before
    public void setUp() {
        log.info("setUp");
    }

    @After
    public void tearDown() {
        log.info("tearDown");
    }

    @Test
    public void test1() {
        log.info("Test 1");
    }

    @Test
    public void test2() {
        log.info("Test 2");
    }
}
