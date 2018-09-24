package designpattern.factory.factory_method;

/**
 * 具体产品类：BMW320
 *
 * 具体产品角色：具体工厂角色所创建的对象就是此角色的实例。
 *              在Java中由具体的类实现。
 */

public class BMW320 extends BMW {
    public BMW320(){
        System.out.println("制造--BMW320");
    }
}
