package starter.Client;

import starter.chain.AbstractChainHandler;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/8/21
 **/
public interface UserChainFilter<T extends String> extends AbstractChainHandler<String> {

    @Override
    default String mark() {
        return "user_chain_filter";
    }
}
