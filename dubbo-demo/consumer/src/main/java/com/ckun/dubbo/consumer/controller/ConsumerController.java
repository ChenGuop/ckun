package com.ckun.dubbo.consumer.controller;

import com.ckun.dubbo.api.dto.User;
import com.ckun.dubbo.consumer.service.ConsumerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chen_guo_peng
 * @create 2020/9/3
 */
@RestController
@RequestMapping("/consumer")
@AllArgsConstructor
public class ConsumerController {
    private final ConsumerService consumerService;

    @GetMapping("/test")
    public User test(String name) {
        return consumerService.test(name);
    }

}
