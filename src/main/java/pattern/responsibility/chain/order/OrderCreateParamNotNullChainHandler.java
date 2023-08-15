package pattern.responsibility.chain.order;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/8/15
 **/
public final class OrderCreateParamNotNullChainHandler implements
OrderCreateChainFilter<OrderCreateCommand>{

    @Override
    public void handler(OrderCreateCommand requestParam) {
        if (requestParam.getParam().equals("")) {
            System.out.println("请求参数不能为null");
            throw new RuntimeException();
        }
    }

    @Override
    public int getOrder() {
        return 9;
    }
}
