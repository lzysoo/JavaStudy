package designpattern.factory.factory_method;

/**
 * �ͻ��ࣺ�������Ҫ�����ͺŵı���
 */

public class Customer {
    public static void main(String[] args) {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();//��������Ķ���
        //BMW bmw320 = factoryBMW320.createBMW();
        factoryBMW320.createBMW();

        FactoryBMW532 factoryBMW532 = new FactoryBMW532();
        //BMW bmw532 = factoryBMW532.createBMW();
        factoryBMW532.createBMW();

    }
}
