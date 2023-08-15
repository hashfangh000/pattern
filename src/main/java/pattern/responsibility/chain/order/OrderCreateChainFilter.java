package pattern.responsibility.chain.order;

import pattern.responsibility.chain.AbstractChainHandler;

/**
 * 订单创建责任链
 */
public interface OrderCreateChainFilter<T extends OrderCreateCommand> extends
        AbstractChainHandler<OrderCreateCommand> {

    @Override
    default String TAG() {
        return "ORDER_CREATE_FILTER";
    }
}
