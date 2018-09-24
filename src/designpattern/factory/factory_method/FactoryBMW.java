package designpattern.factory.factory_method;

/**
 * 创建工厂类：宝马集团以及下属型号分工厂
 *
 * 抽象工厂角色：工厂方法模式的核心，它与应用程序无关。
 *              是具体工厂角色必须实现的接口或必须继承的父类。
 *              在Java中它由抽象类或者借口来实现。
 */

public interface FactoryBMW {
    BMW createBMW();
}
