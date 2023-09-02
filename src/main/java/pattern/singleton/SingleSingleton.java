package pattern.singleton;

/**
 * @description:
 * @author: fee
 * @create: 2023/9/2
 **/
public final class SingleSingleton {

    // 单线程实现 base
    private static SingleSingleton instance;

    private String value;

    public SingleSingleton(String value) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static SingleSingleton getInstance(String value) {
        if (instance == null) {
            instance = new SingleSingleton(value);
        }
        return instance;
    }
}
