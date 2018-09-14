package thread_test.test3;

public class Main {
    public static void main(String[] args) {
        Thread1 mTh1 = new Thread1("A");
        Thread1 mTh2 = new Thread1("B");
        mTh1.start();
        mTh2.start();
        //ʹ��join()������ʹ�� A B ִ�����ټ���ִ�к���Ĵ���
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

        //ÿ���߳���ͬһ��ʵ����������������������Ч���� �̳�Thread��һ�������ο�Thread1
        Thread2 my = new Thread2();
        new Thread(my,"C").start();
        new Thread(my,"D").start();
    }
}
