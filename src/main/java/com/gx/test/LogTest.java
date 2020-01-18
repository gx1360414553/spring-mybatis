package com.gx.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.logging.Logger;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年01月18日 19:19:00
 */
public class LogTest {
    public static void main(String[] args) {
        Log log = LogFactory.getLog("LogTest");
        log.info("jcl");

        Logger logger = Logger.getLogger("Logtest");
    }
}
