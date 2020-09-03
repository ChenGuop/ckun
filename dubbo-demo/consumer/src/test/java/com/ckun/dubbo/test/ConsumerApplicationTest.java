package com.ckun.dubbo.test;

import com.ckun.dubbo.consumer.ConsumerApplication;
import com.ckun.dubbo.consumer.service.ConsumerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author chen_guo_peng
 * @create 2020/9/2
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerApplication.class)
public class ConsumerApplicationTest {
    @Autowired
    private ConsumerService consumerService;

    @Test
    public void test(){
        consumerService.test("DaPeng");
    }
}
