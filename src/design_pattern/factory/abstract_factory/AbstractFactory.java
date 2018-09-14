package design_pattern.factory.abstract_factory;

/**
 * 抽象工厂类：创建工厂接口
 */

public interface AbstractFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}
