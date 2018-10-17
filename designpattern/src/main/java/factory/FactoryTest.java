package factory;


import org.junit.Test;

/**
 * @ClassName FactoryTest
 * @Description 简单工厂模式测试
 * @Author ChengGuojun
 * @Date 2018-10-17 22:17
 * @Version 1.0
 */
public class FactoryTest {
    @Test
    public void carTest(){

        Car car1 = SimpleCarFactory.getAudi();
        Car car2 = SimpleCarFactory.getChangCheng();

        Car car3 = SimpleCarFactory2.getCarsByType("AUDI");
        Car car4 = SimpleCarFactory2.getCarsByType("CHANGCHENG");






    }



}
