package com.service.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.service.testI.SpringTestCase;
import com.sogou.qadev.cache.ehcacheTestI;


public class EhCacheTestServiceTest extends SpringTestCase {

    @Autowired  
    private ehcacheTestI ehCacheTestService;

    @Test  
    public void getTimestampTest() throws InterruptedException{  
    	
    	System.out.println("test");
    	System.out.println("00秒调用：" + ehCacheTestService.getTimestamp("param"));
        Thread.sleep(2000);
        System.out.println("02秒调用：" + ehCacheTestService.getTimestamp("param"));
        Thread.sleep(11000);
        System.out.println("11秒调用：" + ehCacheTestService.getTimestamp("param"));
    } 
}