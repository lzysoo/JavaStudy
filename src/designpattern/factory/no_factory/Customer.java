package designpattern.factory.no_factory;

/**
 * 客户需要知道怎么去创建一款车，客户和车就紧密的耦合在一起了
 * 为了降低耦合，就出现了工厂类，把创建宝马的操作细节都放到工厂里面去
 * 客户直接使用工厂的创建工厂方法，传入想要的宝马车型号就可以了，而不必去知道创建的细节
 */

public class Customer {
    public static void main(String[] args) {
        BMW320 bmw320 = new BMW320();
        BMW523 bmw523 = new BMW523();
    }
}
