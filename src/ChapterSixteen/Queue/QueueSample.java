package ChapterSixteen.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        Queue <Integer> queue = new PriorityQueue<>(1);
        queue.add(1);
        queue.add(1);
        queue.add(1);
        queue.add(1);
       queue.offer(5);
        System.out.println(queue.peek());
    }
}
