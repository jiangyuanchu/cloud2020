package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description todo
 * @ClassName OrderConsulController
 * @Author Jiang YuanChu[jiang_yc@suixingpay.com]
 * @Date 2021/5/31 14:52
 * @Version V1.0
 */
@RestController
@Slf4j
public class OrderConsulController {

    public static final String  INVOKE_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return result;
    }

}
