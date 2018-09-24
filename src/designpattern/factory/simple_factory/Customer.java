package designpattern.factory.simple_factory;

/**
 * 客户类：客户提出需求，和工厂是依赖关系，客户依赖工厂创造宝马
 */

public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }
}
