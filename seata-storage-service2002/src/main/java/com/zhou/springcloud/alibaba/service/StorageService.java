package com.zhou.springcloud.alibaba.service;


/**
 * @author zhoushize
 * @data 2022/1/25
 **/
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
