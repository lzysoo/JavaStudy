package designpattern.factory.factory_method;

/**
 * ���幤���ࣺ����5ϵ�й���
 *
 * ���幤�̽�ɫ�������к;���ҵ���߼���صĴ��롣
 *             ��Ӧ�ó�������Դ�����Ӧ�ľ����Ʒ����
 */

public class FactoryBMW532 implements FactoryBMW {
    @Override
    public BMW createBMW() {
        return new BMW532();
    }
}
