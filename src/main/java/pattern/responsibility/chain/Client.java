package pattern.responsibility.chain;

import pattern.responsibility.chain.order.OrderCreateCommand;
import pattern.responsibility.chain.order.OrderCreateParamNotNullChainHandler;
import pattern.responsibility.chain.order.OrderCreateParamOverStack;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/8/15
 **/
public class Client {
    public static void main(String[] args) {
        AbstractChainHandler<OrderCreateCommand> handler =
                new OrderCreateParamOverStack();

        handler.handler(new OrderCreateCommand("dsadsa"));
    }
}
