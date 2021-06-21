package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description todo
 * @ClassName FeignConfig
 * @Author Jiang YuanChu[jiang_yc@suixingpay.com]
 * @Date 2021/6/2 18:17
 * @Version V1.0
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
