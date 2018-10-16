package singleton;

/**
 * @ClassName SingletDemo4
 * @Description 静态内部类实现方式（也就是懒加载）
 * @Author ChengGuojun
 * @Date 2018-10-16 21:43
 * @Version 1.0
 */
public class SingletDemo4 {
    private static class SingletDemo4Classinstance{
        private static final SingletDemo4 instance = new SingletDemo4();
    }
    public static SingletDemo4 getInstance(){
        return SingletDemo4Classinstance.instance;
    }

    private SingletDemo4(){};

}
