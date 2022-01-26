package com.zhou.springcloud.alibaba.service;

import com.zhou.springcloud.entity.CommonResult;
import com.zhou.springcloud.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @author zhoushize
 * @data 2022/1/24
 **/
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
