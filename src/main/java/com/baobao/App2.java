package com.baobao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App2
{
    private static Logger logger = LoggerFactory.getLogger(App2.class);
    public static void main( String[] args )
    {
        logger.info("hello world");
        new App1().print();
    }
}
