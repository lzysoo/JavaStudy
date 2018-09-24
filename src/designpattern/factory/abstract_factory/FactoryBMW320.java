package designpattern.factory.abstract_factory;

/**
 * 具体工厂类：宝马3系列生产配件
 */

public class FactoryBMW320 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
