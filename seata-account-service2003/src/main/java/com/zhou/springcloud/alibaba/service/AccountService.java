package com.zhou.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;


/**
 * @author zhoushize
 * @data 2022/1/25
 **/
public interface AccountService {

    /**
     * 扣减账户余额
     *
     * @param userId 用户id
     * @param money  金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
