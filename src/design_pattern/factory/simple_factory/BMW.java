package design_pattern.factory.simple_factory;

/**
 * 抽象产品类：制造的产品也是通过客户的要求创造的，但只创造一个产品的抽象类
 *        具体创造什么再由产品类的具体子类实现
 *
 * 抽象产品类一般是具体产品类继承的父类或者实现的接口
 */

abstract class BMW {
    public BMW() {}
}
