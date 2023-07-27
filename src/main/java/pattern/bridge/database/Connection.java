package pattern.bridge.database;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/7/28
 **/

/**
 * 连接方式接口
 */
public interface Connection {
    void connect();
    void executeQuery(String sql);
}
