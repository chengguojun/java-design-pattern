package factory;

/**
 * @ClassName SimpleFactory2
 * @Description TODO
 * @Author ChengGuojun
 * @Date 2018-10-17 22:15
 * @Version 1.0
 */
public class SimpleCarFactory2 {


    public static Car getCarsByType(String type) {
        switch (type) {
            case "AUDI":
                return new Audi();
            case "CHANGCHENG":
                return new ChangCheng();
            default:
                return null;
        }

    }


}
