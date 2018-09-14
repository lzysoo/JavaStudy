package thread_test.test3;

public class Main {
    public static void main(String[] args) {
        Thread1 mTh1 = new Thread1("A");
        Thread1 mTh2 = new Thread1("B");
        mTh1.start();
        mTh2.start();
        //使用join()方法，使得 A B 执行完再继续执行后面的代码
        try{
            mTh1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        try{
            mTh2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("-------------------");
        /*
        Thread2 my1 = new Thread2();
        Thread2 my2 = new Thread2();
        new Thread(my1,"C").start();
        new Thread(my2,"D").start();
        */

        //每个线程用同一个实例化对象，若像上面的情况，效果了 继承Thread类一样，，参考Thread1
        Thread2 my = new Thread2();
        new Thread(my,"C").start();
        new Thread(my,"D").start();
    }
}
