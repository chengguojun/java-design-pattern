package factoryMethod;

import factory.Audi;
import factory.Car;

/**
 * @ClassName AudiFactory
 * @Description TODO
 * @Author ChengGuojun
 * @Date 2018-10-18 21:28
 * @Version 1.0
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
