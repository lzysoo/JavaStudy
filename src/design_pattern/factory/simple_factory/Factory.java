package design_pattern.factory.simple_factory;

/**
 * 工厂类：工厂类在接到订单后按照客户提供的参数制造
 *
 * 工厂类是本模式的核心，含有一定的商业逻辑和判断逻辑，用来创建产品
 */

public class Factory {
    public BMW createBMW(int type){
        switch(type){
            case 320:
                return new BMW320();
            case 523:
                return new BMW523();
            default:
                break;
        }
        return null;
    }
}
