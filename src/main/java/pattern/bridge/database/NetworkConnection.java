package pattern.bridge.database;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/7/28
 **/

/**
 * 网络连接实现
 */
public class NetworkConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("网络连接数据库～");
    }

    @Override
    public void executeQuery(String sql) {
        System.out.println("网络连接执行查询" + sql);
    }
}
