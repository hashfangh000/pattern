package starter.Client;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/8/21
 **/
public final class UserAgeChainHandler implements UserChainFilter<String> {
    @Override
    public boolean handler(String param) {
        if (!param.equals("18")) {
            System.out.println("第" + getOrder() + "条链，执行失败");
            return false;
        }
        return true;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
