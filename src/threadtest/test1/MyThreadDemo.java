package threadtest.test1;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        //my.run();
       // my.run();
        //����run()�����ǵ��̵߳ģ���ֱ�ӵ����൱������ͨ��������

        MyThread my2 = new MyThread();
        my1.setName("zeyueli");
        my1.start();
        my2.start();
        System.out.println(my1.getName());
        System.out.println(Thread.currentThread().getName());
    }
}
