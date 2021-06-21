package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description todo
 * @ClassName PaymentMain8001
 * @Author Jiang YuanChu[jiang_yc@suixingpay.com]
 * @Date 2021/5/25 15:48
 * @Version V1.0
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }

}
