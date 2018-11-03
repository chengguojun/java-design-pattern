package singleton;

/**
 * @ClassName SingletDemo6
 * @Description 测试懒汉式单例模式（如何防止反射和序列化）
 * @Author ChengGuojun
 * @Date 2018-10-16 22:15
 * @Version 1.0
 */
public class SingletDemo6 {

    private static SingletDemo6 singletDemo6;

    private SingletDemo6() {
    }

    /**
    * @Author cheng
    * @Description  资源利用率高，但是并发效率低
    * @Date 21:27 2018/11/3
    * @return SingletDemo6
    *
    */
    public static synchronized SingletDemo6 getInstance() {
        if (singletDemo6 == null) {
            return new SingletDemo6();
        }
        return singletDemo6;
    }
}
