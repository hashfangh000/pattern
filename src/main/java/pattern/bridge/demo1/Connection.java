package pattern.bridge.demo1;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/7/28
 **/
public abstract class Connection {
    protected Database database;

    public Connection(Database database) {
        this.database = database;
    }

    public abstract void connect(String url);

}
