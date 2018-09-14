package design_pattern.factory.abstract_factory;

/**
 * 具体工厂类：宝马5系列生产配件
 */

public class FactoryBMW523 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
