package pattern.responsibility.chain.order;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/8/15
 **/
public final class OrderCreateParamOverStack implements
OrderCreateChainFilter<OrderCreateCommand>{

    @Override
    public void handler(OrderCreateCommand requestParam) {
        System.out.println("商品数量大于库存");
        throw new RuntimeException("库存不足");
    }

    @Override
    public int getOrder() {
        return 10;
    }
}
