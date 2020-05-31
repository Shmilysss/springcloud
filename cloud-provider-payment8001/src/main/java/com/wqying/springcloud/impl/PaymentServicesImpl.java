package com.wqying.springcloud.impl;

import com.wqying.springcloud.dao.PaymentDao;
import com.wqying.springcloud.entities.Payment;
import com.wqying.springcloud.services.PaymentServices;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author: wanqiangying
 * Date: 2020/5/30 20:02
 * Content:
 */
@Service
public class PaymentServicesImpl implements PaymentServices {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    public Payment getPaymentById( Long id){
        return paymentDao.getPaymentById(id);
    }
}
