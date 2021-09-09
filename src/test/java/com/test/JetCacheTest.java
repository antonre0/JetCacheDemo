package com.test;

import com.test.dao.HelloDao;
import com.test.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class JetCacheTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void test(){
        for (int i = 0; i < 10; i++) {
            String msg = helloService.getMsg(1);
            System.out.println(msg);
        }
        System.out.println();
    }
}
