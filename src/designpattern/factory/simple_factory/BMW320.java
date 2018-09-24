package designpattern.factory.simple_factory;

/**
 * 具体产品类BMW320：继承BMW
 *
 * 工厂类创建的对象就是此角色的实例，在Java中由一个具体类实现
 */

public class BMW320 extends BMW {
    public BMW320() {
        System.out.println("制造--BMW320");
    }
}
