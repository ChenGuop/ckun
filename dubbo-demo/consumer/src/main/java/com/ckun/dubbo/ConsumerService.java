package com.ckun.dubbo;

import com.ckun.dubbo.dto.User;
import com.ckun.dubbo.service.ProviderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author chen_guo_peng
 * @create 2020/9/2
 */
@Service
@Slf4j
@AllArgsConstructor
public class ConsumerService {
    private final ProviderService providerService;

    public User test(String name) {
        log.info("ConsumerService==>name:{}", name);
        return providerService.findByUsername(name);
    }
}
