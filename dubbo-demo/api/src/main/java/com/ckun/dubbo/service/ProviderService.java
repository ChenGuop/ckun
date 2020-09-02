package com.ckun.dubbo.service;

import com.ckun.dubbo.dto.User;

/**
 * @author chen_guo_peng
 * @create 2020/9/1
 */
public interface ProviderService {

    /**
     * 查询用户
     * @param value
     * @return
     */
    User findByUsername(String value);

    /**
     * sayHi
     * @param name
     * @return
     */
    String sayName(String name);
}
