package com.wqying.springcloud.services;

import com.wqying.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Author: wanqiangying
 * Date: 2020/5/30 20:01
 * Content:
 */
public interface PaymentServices {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
