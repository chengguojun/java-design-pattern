package factoryMethod;

import factory.Car;
import factory.ChangCheng;

/**
 * @ClassName Changcheng
 * @Description TODO
 * @Author ChengGuojun
 * @Date 2018-10-18 21:29
 * @Version 1.0
 */
public class ChangChengFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new ChangCheng();
    }
}
