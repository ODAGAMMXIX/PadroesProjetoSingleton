public final class ThreadFactory {
    private static final ThreadFactory INSTANCE = new ThreadFactory();

    private ThreadFactory() {}

    public static ThreadFactory getInstance() {
        return INSTANCE;
    }

    public Thread createThread(Runnable runnable) {
        return new Thread(runnable);
    }
}

public class Main { 
    public static void main(String[] args) {

ThreadFactory threadFactory = ThreadFactory.getInstance();
Thread thread = threadFactory.createThread(() -> System.out.println("Executando thread"));
thread.start();


    }
}
