package com.ckun.dubbo.consumer.service;

import com.ckun.dubbo.api.dto.User;
import com.ckun.dubbo.api.service.ProviderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author chen_guo_peng
 * @create 2020/9/2
 */
@Service
@Slf4j
public class ConsumerService {
    @Reference(version = "1.0.0")
    private ProviderService providerService;

    public User test(String name) {
        log.info("ConsumerService==>name:{}", name);
        return providerService.findByUsername(name);
    }
}
