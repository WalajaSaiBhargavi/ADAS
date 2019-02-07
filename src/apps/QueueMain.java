package apps;

import DefaultPackage.BasicQueue;

public class QueueMain {
    public static void main(String[] args) {
        BasicQueue<String> queue = new BasicQueue<>(1000);
        queue.enqueue("bha");
        queue.enqueue("bha1");
        queue.enqueue("bha2");
        queue.enqueue("bha3");
        queue.enqueue("bha4");
        queue.enqueue("bha5");
        queue.enqueue("bha6");
        queue.enqueue("bha7");
        queue.enqueue("bha8");
        queue.enqueue("bha9");
        queue.enqueue("bha10");
        queue.enqueue("bha11");
        queue.enqueue("bha12");
        queue.enqueue("bha13");

        queue.access();
        for (int i = 0; i < 15; i++) {
            System.out.println(queue.dequeue());
        }
    }
}
