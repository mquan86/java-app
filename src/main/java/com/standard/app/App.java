package com.standard.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Quan Pham (mquan86@gmail.com)
 * 
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(final String[] args) {
        log.error("This is an error log");
        log.warn("This is a warn log");
        log.info("This is an info log");
        log.debug("This is a debug log");
        log.trace("This is a trace log");
        log.error("This is an error log with exception", new RuntimeException());
    }
}
