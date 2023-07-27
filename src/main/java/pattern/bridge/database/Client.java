package pattern.bridge.database;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/7/28
 **/
public class Client {
    public static void main(String[] args) {
        Connection localConnection = new LocalConnection();
        Database mysqlDB = new MysqlDB(localConnection);
        mysqlDB.connect();
        mysqlDB.query("select * from mysql");

        Connection networkConnection = new NetworkConnection();
        Database oracleDB = new OracleDB(networkConnection);
        oracleDB.connect();
        oracleDB.query("select * from oracle");

    }
}
