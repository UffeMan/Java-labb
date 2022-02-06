package labb.upg.fyra;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MinTråd mt1 = new MinTråd(0, 19);
        MinTråd mt2 = new MinTråd(20, 39);
        MinTråd mt3 = new MinTråd(40, 59);
        MinTråd mt4 = new MinTråd(499800, 500000);
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        Thread t3 = new Thread(mt3);
        Thread t4 = new Thread(mt4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println("\n\nFärdig");
    }
}
