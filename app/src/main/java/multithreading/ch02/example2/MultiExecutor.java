package multithreading.ch02.example2;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {
    private final List<Runnable> tasks;

    public MultiExecutor(List<Runnable> tasks) {
        this.tasks = tasks;
    }

    public void executeAll()  {
        ArrayList<Thread> threads = new ArrayList<>(tasks.size());

        for(Runnable task : tasks) {
            Thread thread = new Thread(task);
            threads.add(thread);
        }

        for(Thread thread : threads) {
            thread.start();
        }
    }
}
