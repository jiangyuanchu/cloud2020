package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description todo
 * @ClassName PaymentMain8001
 * @Author Jiang YuanChu[jiang_yc@suixingpay.com]
 * @Date 2021/5/25 15:48
 * @Version V1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }

}
