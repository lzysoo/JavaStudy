package design_pattern.factory.abstract_factory;

/**
 * ���󹤳��ࣺ���������ӿ�
 */

public interface AbstractFactory {
    //���췢����
    public Engine createEngine();
    //����յ�
    public Aircondition createAircondition();
}
