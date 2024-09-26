public class SleepEx{
    public static void main(String[] args) throws InterruptedException{
           Thread thread = new Thread(new LetsRun());
           thread.start();
           //Thread.sleep(3000);
            thread.interrupt();
            System.out.println("Thread is interrupted"+thread.isInterrupted());
        }
}