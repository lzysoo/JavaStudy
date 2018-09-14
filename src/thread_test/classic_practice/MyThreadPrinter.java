package thread_test.classic_practice;

/**
 * 经典面试题：
 * 建立3个线程，A线程打印10次A，B线程打印10次B,C线程打印10次C，要求线程同时运行，交替打印10次ABC
 *
 * 考察点：Object的wait()、notify()方法
 * 分析：
 *      A、B、C循环执行三个线程，为了控制其执行顺序，就必须要确定唤醒、等待的顺序
 *      每一个线程必须同时持有两个对象锁，一个为prev，即前一个线程持有的对象锁，另一个为self，即自身对象锁
 * 主要思想：
 *      先持有prev锁，即前一个线程要释放自身对象锁
 *      再去申请自身对象锁
 *      两者兼备时打印
 *      然后，先调用self.notify()释放自身对象锁，唤醒下一个等待线程
 *      再调用prev.wait()释放prev对象锁，终止当前线程
 *      等待循环结束后再次被唤醒
 * A线程最先运行，持有C,A对象锁，后释放A,C锁，唤醒B。
 * 线程B等待A锁，再申请B锁，后打印B，再释放B，A锁，唤醒C。
 * 线程C等待B锁，再申请C锁，后打印C，再释放C,B锁，唤醒A。
 */
public class MyThreadPrinter implements Runnable {
    private String name;
    private Object prev;
    private Object self;
    public MyThreadPrinter(String name,Object prev,Object self){
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run(){
        int count = 10;
        while (count > 0){
            synchronized(prev){
                synchronized (self){
                    System.out.print(name);
                    count--;
                    self.notify();
                }
                try{
                    prev.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        MyThreadPrinter pa = new MyThreadPrinter("A",c,a);
        MyThreadPrinter pb = new MyThreadPrinter("B",a,b);
        MyThreadPrinter pc = new MyThreadPrinter("C",b,c);

        new Thread(pa).start();
        Thread.sleep(100);
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);
    }
}
