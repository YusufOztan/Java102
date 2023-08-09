package ThreadRace;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numberList.add(i);
        }

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        int chunkSize = numberList.size() / 4;
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i + 1) * chunkSize;
            List<Integer> subList = numberList.subList(startIndex, endIndex);

            Thread thread = new Thread(new NumberProcessor(subList, evenNumbers, oddNumbers));
            threads.add(thread);
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized (evenNumbers) {
            System.out.println("Even numbers: " + evenNumbers);
        }
        synchronized (oddNumbers) {
            System.out.println("Odd numbers: " + oddNumbers);
        }
    }
}
