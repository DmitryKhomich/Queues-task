package demos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class Task02 {

    public static void main(String[] args) {
        System.out.println("Initial data:");
        printQueue(initQueue());
        System.out.println();
        System.out.println("Updated data:");
        printQueue(updateData(initQueue()));
    }

    private static Queue<String> initQueue(){
        Queue<String> queue = new LinkedList<>();
        queue.add("apricot");
        queue.add("mango");
        queue.add("cherry");
        queue.add("rice");
        return queue;
    }

    private static void printQueue(Queue<String> q){
        AtomicInteger counter = new AtomicInteger(1);
        for(String s : q){
            System.out.println(counter + ") " + s);
            counter.getAndIncrement();
        }
    }

    private static Queue<String> updateData (Queue<String> q){
        q.poll();
        return q;
    }
}
