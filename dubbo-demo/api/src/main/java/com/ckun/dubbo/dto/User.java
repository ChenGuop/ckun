package com.ckun.dubbo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chen_guo_peng
 * @create 2020/9/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String username;
    private int age;
}
