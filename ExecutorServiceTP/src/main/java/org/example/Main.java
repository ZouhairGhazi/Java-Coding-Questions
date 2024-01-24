package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Main {

    public static String readFile(int num) {
        return "Reading file number : " + num + ".";
    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            nums.add(i);
        }

        ExecutorService exec = Executors.newFixedThreadPool(10);

        List<Future<String>> fs = nums.stream()
                .map(num -> exec.submit(() -> readFile(num)))
                .toList();


        for (Future<String> f : fs) {
            try {
                System.out.println(f.get());
                System.out.println("It worked !");
            } catch (ExecutionException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}