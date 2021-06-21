package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description todo
 * @ClassName OrderConsulMain80
 * @Author Jiang YuanChu[jiang_yc@suixingpay.com]
 * @Date 2021/5/31 14:49
 * @Version V1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderConsulMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain80.class, args);
    }

}
