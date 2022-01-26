package com.zhou.springcloud.alibaba.controller;

import com.zhou.springcloud.alibaba.domain.CommonResult;
import com.zhou.springcloud.alibaba.domain.Order;
import com.zhou.springcloud.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoushize
 * @data 2022/1/25
 **/
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
