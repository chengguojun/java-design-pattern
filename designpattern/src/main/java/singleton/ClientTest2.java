package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName ClientTest
 * @Description 如何防止反序列化破解
 * @Author ChengGuojun
 * @Date 2018-10-16 21:54
 * @Version 1.0
 */
public class ClientTest2 {
    public static void main(String[] args) {
        SingletDemo3 s1 = SingletDemo3.getInstance();
        SingletDemo3 s2 = SingletDemo3.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        try {

            Class<SingletDemo3> clazz = (Class<SingletDemo3>) Class.forName("singleton.SingletDemo3");
            Constructor<SingletDemo3> c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            SingletDemo3 s3 = c.newInstance();
            SingletDemo3 s4 = c.newInstance();
            System.out.println(s3);
            System.out.println(s4);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }




}
