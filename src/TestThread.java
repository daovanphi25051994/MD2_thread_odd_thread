public class TestThread {
    public static void main(String[] args) {
        System.out.println("main begin");
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        evenThread.start();
        System.out.println("main end");
    }
}
