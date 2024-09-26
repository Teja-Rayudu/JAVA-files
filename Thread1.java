//import java.util.Scanner;
public class Thread1{
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the Threads to be create");
        int numT=sc.nextInt();*/
        Thread threads = new Thread(new MyRunnable());
        /*for(int i = 0;i<numT;i++){
            MyRunnable th = new MyRunnable();
            Thread t1 = new Thread(th);
            threads[i] = new FirstThread();
             t1.start();
        }
        System.out.println("Thread Name:");
        for(Thread thread :threads){
            thread.start();
        }*/
        threads.setName("Teja's thread");
        threads.setPriority(Thread.NORM_PRIORITY);
        threads.setDaemon(true);
        threads.start();
    }

} 