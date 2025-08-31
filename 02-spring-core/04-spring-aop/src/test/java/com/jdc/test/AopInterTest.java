package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.interType.MyService;
import com.jdc.interType.Worker;

@SpringJUnitConfig(locations = "classpath:context-interType.xml")
public class AopInterTest {

	@Autowired
	Worker worker;
	
	@Test
	void test() {
		worker.doWork();
		
		if(worker instanceof MyService service) {
			service.doSomething();
		}
	}
=======

import com.jdc.InnerType.MyService;
import com.jdc.InnerType.Worker;

public class AopInterTest {

    @Autowired
    Worker worker;

    @Test
    void test() {
        worker.doWork();
        if(worker instanceof MyService service){
            service.doSomething();
        }
    
    }
>>>>>>> origin/hzl
}
