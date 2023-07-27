package pattern.bridge.database;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/7/28
 **/

/**
 * 数据库接口
 */
public interface Database {
    void connect();
    void query(String sql);
}
