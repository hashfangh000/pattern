package pattern.bridge.database;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/7/28
 **/

/**
 * 定义mysql类型，需要聚合connection
 */
public class OracleDB implements Database{

    protected Connection connection;

    public OracleDB(Connection connection) {
        this.connection = connection;
    }


    @Override
    public void connect() {
        connection.connect();
    }

    @Override
    public void query(String sql) {
        connection.executeQuery(sql);
    }
}
