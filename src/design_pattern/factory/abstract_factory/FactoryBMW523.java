package design_pattern.factory.abstract_factory;

/**
 * ���幤���ࣺ����5ϵ���������
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
