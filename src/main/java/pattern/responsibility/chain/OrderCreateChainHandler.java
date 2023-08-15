package pattern.responsibility.chain;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @description: 订单责任链处理接口
 * @author: Bitfh
 * @create: 2023/8/14
 **/
public interface OrderCreateChainHandler<T> extends Ordered {

    /**
     * 责任链逻辑
     * @param requestParam
     */
    void handler (T requestParam);
}
