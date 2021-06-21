package com.atguigu.springcloud.entities;

import lombok.*;

/**
 * @Description todo
 * @ClassName Payment
 * @Author Jiang YuanChu[jiang_yc@suixingpay.com]
 * @Date 2021/5/25 16:01
 * @Version V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Payment {

    private Long id;

    private String serial;

}
