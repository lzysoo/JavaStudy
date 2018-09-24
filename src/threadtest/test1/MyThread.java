package threadtest.test1;

public class MyThread extends Thread {

    public MyThread(){
    }

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 200; i++) {
            System.out.println(i);
        }
    }
}
