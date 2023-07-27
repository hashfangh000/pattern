package pattern.bridge.demo1;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/7/28
 **/
public class RedisDB implements Database{
    @Override
    public void connect(String url) {
        System.out.println("resis连接 ： " + url);
    }
}
