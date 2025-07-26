package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

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
}
