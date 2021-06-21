package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description todo
 * @ClassName OrderFeignMain80
 * @Author Jiang YuanChu[jiang_yc@suixingpay.com]
 * @Date 2021/6/2 16:43
 * @Version V1.0
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }

}
