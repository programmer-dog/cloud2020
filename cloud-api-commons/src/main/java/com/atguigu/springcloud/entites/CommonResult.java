package com.atguigu.springcloud.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @描述
 * @创建人 gaozc
 * @创建时间 $
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private T data;
    private String message;
    public CommonResult(Integer code, String message){
        this(code,null,message);
    }
}
