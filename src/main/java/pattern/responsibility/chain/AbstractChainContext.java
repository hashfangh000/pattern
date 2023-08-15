package pattern.responsibility.chain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;

import java.util.*;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/8/15
 **/
public final class AbstractChainContext<T> implements CommandLineRunner {

    private final Map<String, List<AbstractChainHandler>>
            abstractChainHandlerContainer = new HashMap<>();

    public void handler(String tag, T requestParam) {
        abstractChainHandlerContainer.get(tag)
                .stream()
                .sorted(Comparator.comparing(Ordered::getOrder))
                .forEach(e -> e.handler(requestParam));
    }


    @Override
    public void run(String... args) throws Exception {

    }
}
