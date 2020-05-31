package com.wqying.springcloud.dao;

import com.wqying.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Author: wanqiangying
 * Date: 2020/5/30 19:49
 * Content:
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
