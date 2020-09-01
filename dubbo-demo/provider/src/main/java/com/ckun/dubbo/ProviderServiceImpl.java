package com.ckun.dubbo;

import com.ckun.dubbo.dto.User;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author chen_guo_peng
 * @create 2020/9/1
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    public User findByUsername(String value) {
        return new User(value, value.length());
    }
}
