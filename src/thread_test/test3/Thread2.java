package thread_test.test3;

public class Thread2 implements Runnable{
    private int count = 10;
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "ÔËĞĞ£º" + count--);
            try{
                Thread.sleep((int)Math.random()*10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
