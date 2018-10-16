package singleton;

/**
 * @ClassName SingletDemo1
 * @Description 饿汉式设计模式，类初始化立刻加载
 * @Author ChengGuojun
 * @Date 2018-10-15 21:55
 * @Version 1.0
 */
public class SingletDemo1 {
    //类初始化立刻加载,线程安全
    private static  SingletDemo1 instance = new SingletDemo1();
    private SingletDemo1(){}
    // 没有同步效率高
    public static SingletDemo1 getInstance(){
        return instance;
    }



}
