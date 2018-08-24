package classworks.lesson17;

import classworks.lesson16.HeavyBox1;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Queue<HeavyBox1> queue = new LinkedList<>();

        queue.offer(new HeavyBox1(3,2,1,2));
        queue.offer(new HeavyBox1(4,3,5,6));
        queue.offer(new HeavyBox1(5,3,8,6));
        queue.offer(new HeavyBox1(5,7,4,3));
        while (queue.size() > 0) {
            System.out.print(queue.poll() + " ");
        }
    }
}
