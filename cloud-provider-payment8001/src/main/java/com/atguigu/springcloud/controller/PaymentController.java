package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description todo
 * @ClassName PaymentController
 * @Author Jiang YuanChu[jiang_yc@suixingpay.com]
 * @Date 2021/5/25 16:21
 * @Version V1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("数据库插入 ：{}", result);
        if(result > 0){
            return new CommonResult(200, "插入数据库成功, serverPort:" + serverPort, result);
        } else {
            return new CommonResult(500, "插入数据库失败, serverPort:" + serverPort, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("数据库查询结果 ：{}", payment);
        if(payment != null){
            return new CommonResult(200, "查询成功, serverPort:" + serverPort, payment);
        } else {
            return new CommonResult(500, "无记录，id:" + id + " serverPort:" + serverPort, null);
        }
    }
}
