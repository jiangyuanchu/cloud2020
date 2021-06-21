package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description todo
 * @ClassName PaymentDao
 * @Author Jiang YuanChu[jiang_yc@suixingpay.com]
 * @Date 2021/5/25 16:07
 * @Version V1.0
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
