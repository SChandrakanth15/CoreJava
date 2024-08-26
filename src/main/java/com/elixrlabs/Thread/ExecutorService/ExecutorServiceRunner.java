
package com.elixrlabs.Thread.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * this class shows that at a time only a single thread can be executed and once it is completed
 * the another one can start it.
 */
public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Task2());
        executorService.shutdown();
    }
}
