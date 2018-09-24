package designpattern.factory.factory_method;

/**
 * 具体工厂类：宝马5系列工厂
 *
 * 具体工程角色：它含有和具体业务逻辑相关的代码。
 *             由应用程序调用以创建对应的具体产品对象。
 */

public class FactoryBMW532 implements FactoryBMW {
    @Override
    public BMW createBMW() {
        return new BMW532();
    }
}
