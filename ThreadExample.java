public class ThreadExample implements Runnable {
    private String name;
    
    public ThreadExample(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println("Thread " + name + " started.");
        
        try {
        
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread " + name + " executing task " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Thread " + name + " finished.");
    }
    
    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample("Thread 1");
        ThreadExample thread2 = new ThreadExample("Thread 2");
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Main thread finished.");
    }
}
