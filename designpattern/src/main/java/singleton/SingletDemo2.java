package singleton;

/**
 * @ClassName SingletDemo2
 * @Description 懒汉式 单例对象加载延迟
 * @Author ChengGuojun
 * @Date 2018-10-16 18:58
 * @Version 1.0
 */
public class SingletDemo2 {
    //
    private static SingletDemo2 singletDemo2;

    private SingletDemo2() {
    }

    // 资源利用率高，但是并发效率低
    public static synchronized SingletDemo2 getInstance() {
        if (singletDemo2 == null) {
            return new SingletDemo2();
        }
        return singletDemo2;
    }


}
