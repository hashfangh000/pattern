package starter.config;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import starter.base.config.ApplicationBaseAutoConfiguration;
import starter.chain.AbstractChainContext;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/8/21
 **/
@ImportAutoConfiguration(ApplicationBaseAutoConfiguration.class)
public class DesignPatternAutoConfiguration {
    /**
     * 责任链模式
     */
    public AbstractChainContext abstractChainHandler() {
        return new AbstractChainContext();
    }
}
