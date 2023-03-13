package day_47;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Roman");
        queue.offer("Mu");
        queue.offer("Roman");
        queue.offer("Julian");
        queue.offer("Mu");

        System.out.println(queue);
//        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue);


    }
}
