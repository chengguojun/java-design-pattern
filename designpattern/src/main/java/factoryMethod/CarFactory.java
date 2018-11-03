package factoryMethod;

import factory.Car;

/**
* @Author cheng
* @Description  工厂方法模式 复杂度高，一般是简单工厂模式
* @Date 21:30 2018/10/18
* @Param
* @return
*
*/
public interface CarFactory {

    Car getCar();

}
