public class ThreadSample {
    public static class Thread_A extends Thread {
        public Thread_A() {
            super("Thread_A");
            setPriority(Thread.MAX_PRIORITY);
        }
        
        public void run() {
            try {
                System.out.println("Thread_A is running with priority: " + getPriority());
                Thread.sleep(20000);
                System.out.println("Thread_A has finished execution.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static class Thread_B extends Thread {
        public Thread_B() {
            super("Thread_B");
            setPriority(Thread.NORM_PRIORITY);
        }
        
        public void run() {
            try {
                System.out.println("Thread_B is running with priority: " + getPriority());
                Thread.sleep(20000);
                System.out.println("Thread_B has finished execution.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static class Thread_C extends Thread {
        public Thread_C() {
            super("Thread_C");
            setPriority(Thread.MIN_PRIORITY);
        }
        
        public void run() {
            try {
                System.out.println("Thread_C is running with priority: " + getPriority());
                Thread.sleep(20000);
                System.out.println("Thread_C has finished execution.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        Thread_A threadA = new Thread_A();
        Thread_B threadB = new Thread_B();
        Thread_C threadC = new Thread_C();
        
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
