package pattern.bridge.demo1;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/7/28
 **/
public class Mac extends Connection{

    public Mac(Database database) {
        super(database);
    }

    @Override
    public void connect(String url) {
        database.connect(url);
    }
}
