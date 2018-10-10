/**
 * 
 */
package com.service.testI;

import org.junit.Test;
/**
 * @author adp
 *
 */
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  

//指定bean注入的配置文件  
@ContextConfiguration(locations = { "classpath:servlet-context.xml" })  
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner  
@RunWith(SpringJUnit4ClassRunner.class)  
public class SpringTestCase extends AbstractJUnit4SpringContextTests {
	
	@Test
	public void test()
	{
		System.out.println("test");
	}

}
