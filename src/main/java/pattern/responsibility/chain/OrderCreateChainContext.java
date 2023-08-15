package pattern.responsibility.chain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * @description: 责任链上下文容器，用于存储与责任链相应的子任务
 * @author: Bitfh
 * @create: 2023/8/14
 **/
public final class OrderCreateChainContext<T> implements CommandLineRunner {

    // 容器
    private final List<OrderCreateChainHandler> orderCreateChainHandlerContainer
            = new ArrayList();

    public void handler(T requestParam) {
        orderCreateChainHandlerContainer.stream()
                .sorted(Comparator.comparing(Ordered::getOrder))
                .forEach(each -> each.handler(requestParam));
    }

    @Override
    public void run(String... args) throws Exception {
//        Map<String, OrderCreateChainHandler> chainFilterMap =
//                BaseHolder.getBeansOfType(OrderCreateChainHandler.class);
    }
}
