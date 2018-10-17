package factory;

/**
 * @ClassName SimpleFactory
 * @Description 简单工厂模式
 * @Author ChengGuojun
 * @Date 2018-10-17 22:14
 * @Version 1.0
 */
public class SimpleCarFactory {

    public static Car getAudi(){
        return new Audi();
    }
    public static Car getChangCheng(){
        return new ChangCheng();
    }


}
