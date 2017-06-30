package thinking_in_java.concurrency;

//: concurrency/DaemonFromFactory.java
// Using a Thread Factory to create daemons.
import static thinking_in_java.net.mindview.util.Print.print;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import thinking_in_java.net.mindview.util.DaemonThreadFactory;

public class DaemonFromFactory implements Runnable {
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                print(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            print("Interrupted");
        }
    }

    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0; i < 10; i++)
            exec.execute(new DaemonFromFactory());
        print("All daemons started");
        TimeUnit.MILLISECONDS.sleep(500); // Run for a while
    }
} /* (Execute to see output) *///:~
