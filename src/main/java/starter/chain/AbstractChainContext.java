package starter.chain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.util.CollectionUtils;
import starter.base.ApplicationContextHolder;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/8/21
 **/
public class AbstractChainContext<T> implements CommandLineRunner {

    private final Map<String, List<AbstractChainHandler<T>>>
            container = new HashMap<>();

    public boolean handler(T param, String mark) {
        List<AbstractChainHandler<T>> abstractChainHandlers = container.get(mark);
        if (CollectionUtils.isEmpty(abstractChainHandlers)) {
            throw new RuntimeException(String.format("[%s] Chain of Responsibility ID is undefined.", mark));
        }
        return abstractChainHandlers.stream()
                .allMatch(e -> e.handler(param));
    }

    @Override
    public void run(String... args) throws Exception {
        Map<String, AbstractChainHandler>
                chainHandlerMap = ApplicationContextHolder
                .getBeansOfType(AbstractChainHandler.class);
        chainHandlerMap.forEach((beanName, bean) -> {
            List<AbstractChainHandler<T>> abstractChainHandlers = container.get(bean.mark());
            if (CollectionUtils.isEmpty(abstractChainHandlers)) {
                abstractChainHandlers = new ArrayList<>();
            }
            abstractChainHandlers.add(bean);
            List<AbstractChainHandler<T>> actualAbstractChainHandlers = abstractChainHandlers.stream()
                    .sorted(Comparator.comparing(Ordered::getOrder))
                    .collect(Collectors.toList());
            container.put(beanName, actualAbstractChainHandlers);
        });
    }
}
