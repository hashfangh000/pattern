package starter.chain;

import org.springframework.core.Ordered;

public interface AbstractChainHandler<T> extends Ordered {

    /**
     * 责任链的其中一条
     * @param param 请求参数
     * @return boolean
     */
    boolean handler(T param);

    /**
     * 标记是哪一条
     * @return mark标记
     */
    String mark();
}
