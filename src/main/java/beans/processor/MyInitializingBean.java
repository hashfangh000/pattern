package beans.processor;

import org.springframework.beans.factory.InitializingBean;


public class MyInitializingBean implements InitializingBean {
    public MyInitializingBean(){
        System.out.println("MyInitializingBean....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyInitializingBean...afterPropertiesSet...");
    }
}
