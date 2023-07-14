package com.bin.springbootinit.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 重试请求
 *

 */
@Data
public class RetryRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}