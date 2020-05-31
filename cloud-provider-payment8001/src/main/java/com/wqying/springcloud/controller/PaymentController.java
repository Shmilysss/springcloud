package com.wqying.springcloud.controller;

import com.wqying.springcloud.entities.CommonResult;
import com.wqying.springcloud.entities.Payment;
import com.wqying.springcloud.services.PaymentServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Author: wanqiangying
 * Date: 2020/5/30 20:06
 * Content:
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentServices paymentServices;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentServices.create(payment);
        log.info("****插入结果****");
        if(result > 0){
            return new CommonResult(200,"insert success!",result);
        }else {
            return new CommonResult(400,"insert error!",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentServices.getPaymentById(id);
        log.info("****查询结果****");
        if(payment != null){
            return new CommonResult(200,"search success!",payment);
        }else {
            return new CommonResult(400,"search error!",null);
        }
    }
}
