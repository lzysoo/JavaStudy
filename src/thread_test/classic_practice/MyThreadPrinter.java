package thread_test.classic_practice;

/**
 * ���������⣺
 * ����3���̣߳�A�̴߳�ӡ10��A��B�̴߳�ӡ10��B,C�̴߳�ӡ10��C��Ҫ���߳�ͬʱ���У������ӡ10��ABC
 *
 * ����㣺Object��wait()��notify()����
 * ������
 *      A��B��Cѭ��ִ�������̣߳�Ϊ�˿�����ִ��˳�򣬾ͱ���Ҫȷ�����ѡ��ȴ���˳��
 *      ÿһ���̱߳���ͬʱ����������������һ��Ϊprev����ǰһ���̳߳��еĶ���������һ��Ϊself�������������
 * ��Ҫ˼�룺
 *      �ȳ���prev������ǰһ���߳�Ҫ�ͷ����������
 *      ��ȥ�������������
 *      ���߼汸ʱ��ӡ
 *      Ȼ���ȵ���self.notify()�ͷ������������������һ���ȴ��߳�
 *      �ٵ���prev.wait()�ͷ�prev����������ֹ��ǰ�߳�
 *      �ȴ�ѭ���������ٴα�����
 * A�߳��������У�����C,A�����������ͷ�A,C��������B��
 * �߳�B�ȴ�A����������B�������ӡB�����ͷ�B��A��������C��
 * �߳�C�ȴ�B����������C�������ӡC�����ͷ�C,B��������A��
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
