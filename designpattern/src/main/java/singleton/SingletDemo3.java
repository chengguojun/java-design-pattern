package singleton;

/**
 * @ClassName SingletDemo3
 * @Description 双重检测锁实现
 * @Author ChengGuojun
 * @Date 2018-10-16 21:31
 * @Version 1.0
 */
public class SingletDemo3 {

    private static SingletDemo3 instance = null;
    public static SingletDemo3 getInstance() {
        if (instance == null) {
            SingletDemo3 sc;
            synchronized (SingletDemo3.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (SingletDemo3.class) {
                        if(sc == null) {
                            sc = new SingletDemo3();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }
    private SingletDemo3() {
    }


}
