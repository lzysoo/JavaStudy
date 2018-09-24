package designpattern.factory.factory_method;

/**
 * 客户类：提出需求，要两种型号的宝马车
 */

public class Customer {
    public static void main(String[] args) {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();//创建具体的对象
        //BMW bmw320 = factoryBMW320.createBMW();
        factoryBMW320.createBMW();

        FactoryBMW532 factoryBMW532 = new FactoryBMW532();
        //BMW bmw532 = factoryBMW532.createBMW();
        factoryBMW532.createBMW();

    }
}
