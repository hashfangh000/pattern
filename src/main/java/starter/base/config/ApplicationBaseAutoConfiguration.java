package starter.base.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import starter.base.ApplicationContextHolder;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/8/21
 **/
public class ApplicationBaseAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public ApplicationContextHolder contextHolder() {
        return new ApplicationContextHolder();
    }
}
