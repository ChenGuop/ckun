package com.ckun.dubbo.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author chen_guo_peng
 * @create 2020/9/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private String username;
    private int age;
}
