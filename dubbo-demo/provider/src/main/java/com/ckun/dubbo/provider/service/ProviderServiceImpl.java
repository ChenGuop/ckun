package com.ckun.dubbo.provider.service;

import com.alibaba.dubbo.rpc.RpcContext;
import com.ckun.dubbo.api.dto.User;
import com.ckun.dubbo.api.service.ProviderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author chen_guo_peng
 * @create 2020/9/1
 */
@Service(version = "1.0.0")
@Slf4j
public class ProviderServiceImpl implements ProviderService {
    @Value("${demo.service.name}")
    private String serviceName;

    public User findByUsername(String value) {
        log.info("ProviderServiceImpl===>value:{}", value);
        return new User(value, value.length());
    }

    public String sayName(String name) {
        RpcContext rpcContext = RpcContext.getContext();
        return String.format("Service [name :%s , port : %d] %s(\"%s\") : Hello,%s",
                serviceName,
                rpcContext.getLocalPort(),
                rpcContext.getMethodName(),
                name,
                name);
    }
}
