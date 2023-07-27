package pattern.bridge.database;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/7/28
 **/

/**
 * 本地连接实现
 */
public class LocalConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("本地连接数据库～");
    }

    @Override
    public void executeQuery(String sql) {
        System.out.println("本地连接执行查询" + sql);
    }
}
