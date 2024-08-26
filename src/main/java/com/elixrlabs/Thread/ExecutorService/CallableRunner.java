package com.elixrlabs.Thread.ExecutorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcomeMessageFuture = executorService.submit(new CallableTask("Chandrakanth"));
        System.out.println("executed-1");
        String WelcomeMessage = welcomeMessageFuture.get();
        System.out.println(WelcomeMessage);
        executorService.shutdown();
    }
}
