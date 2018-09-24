package threadtest.test2;

public class Main {
    public static void main(String[] args) {
        Thread1 mTh1 = new Thread1("A");
        Thread1 mTh2 = new Thread1("B");
        mTh1.start();
        mTh2.start();

        Thread mTh3 = new Thread(new Thread2("C"));
        Thread mTh4 = new Thread(new Thread2("D"));
        mTh3.start();
        mTh4.start();
    }
}
