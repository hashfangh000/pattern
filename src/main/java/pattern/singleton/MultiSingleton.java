package pattern.singleton;

/**
 * @description:
 * @author: fee
 * @create: 2023/9/2
 **/
public final class MultiSingleton {

    // double check线程实现 base
    private static MultiSingleton instance;

    private String value;

    public MultiSingleton(String value) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static MultiSingleton getInstance(String value) {
        if (instance == null) {
            synchronized (MultiSingleton.class) {
                instance = new MultiSingleton(value);
            }
        }
        return instance;
    }
}
