package com.atguigu.springcloud.entites;

/**
 * @描述
 * @创建人 gaozc
 * @创建时间 $
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @描述
 * @创建人 gaozc
 * @创建时间 $
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;

}
