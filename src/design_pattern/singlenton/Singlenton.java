package design_pattern.singlenton;

/**
 * 懒汉单例设计模式，在第一次调用方法时实例化自己
 *
 * @author zeyueli
 * @date 2018/8/9 AM:11:00
 */
public class Singlenton {
    private Singlenton(){}//私有化构造函数
    private static Singlenton single;
    //getInstance()用来生成唯一的实例，往往是static的
    public static Singlenton getInstance(){    //线程不安全写法
        if(single == null)
            single = new Singlenton();
        return single;
    }

}
/*
public class Singlenton2{
    private Singlenton2(){}
    private static Singlenton2 single;
    public static synchronized Singlenton2 getInstance(){  //线程安全写法，加了同步字段synchronized
        if (single == null)
            single = new Singlenton2();
        return single;
    }
}
*/
/**
 * 饿汉单例设计模式：在类加载时得到自己的实例
 *
 * @author zeyueli
 * @date 2018/8/9 AM:11:30
 */
/*
public class Singlenton3{
    private Singlenton3(){}
    private static Singlenton3 single = new Singlenton3();
    public static Singlenton3 getInstance(){
        return single;
    }
}
*/
/**
 * 应用场景：
 * Windows的Task Manager（任务管理器）
 * Windows的Recycle Bin（回收站）
 */





