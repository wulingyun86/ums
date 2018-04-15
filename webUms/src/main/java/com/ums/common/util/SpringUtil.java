package com.ums.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringUtil implements ApplicationContextAware{
	private static ApplicationContext applicationContext;  

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		SpringUtil.applicationContext = applicationContext;  
		
	}
	
	public static ApplicationContext getApplicationContext() {  
        return applicationContext;  
    } 
	
	public static Object getBean(String name) throws BeansException {  
	        return applicationContext.getBean(name);  
	}

}
