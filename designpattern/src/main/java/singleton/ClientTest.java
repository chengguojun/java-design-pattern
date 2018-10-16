package singleton;

/**
 * @ClassName ClientTest
 * @Description TODO
 * @Author ChengGuojun
 * @Date 2018-10-16 21:54
 * @Version 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        SingletDemo3 singletDemo3 = SingletDemo3.getInstance();
        SingletDemo3 singletDemo32 = SingletDemo3.getInstance();

        System.out.println(singletDemo3);
        System.out.println(singletDemo32);
    }
}
