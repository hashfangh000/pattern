package pattern.bridge.demo1;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/7/28
 **/
public class Client {
    public static void main(String[] args) {
        Connection mac = new Mac(new OracleDB());
        mac.connect("12.1.2.3");
    }
}
