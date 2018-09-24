package designpattern.factory.abstract_factory;

/**
 * ���幤���ࣺ����3ϵ���������
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
