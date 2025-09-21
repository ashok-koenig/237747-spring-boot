package multithreading_demo;

public class ThreadLifeCycleExample extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running..."); // Running...

        try {
            Thread.sleep(2000);  // Interrupted / Blocked
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycleExample thread = new ThreadLifeCycleExample(); // New
        System.out.println("Thread state after creation: "+ thread.getState());

        thread.start(); // Runnable

        thread.join();

        System.out.println("Thread state after completion: "+ thread.getState());

    }
}
