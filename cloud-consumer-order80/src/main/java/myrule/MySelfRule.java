package myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description todo
 * @ClassName MySelfRule
 * @Author Jiang YuanChu[jiang_yc@suixingpay.com]
 * @Date 2021/5/31 17:45
 * @Version V1.0
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}
