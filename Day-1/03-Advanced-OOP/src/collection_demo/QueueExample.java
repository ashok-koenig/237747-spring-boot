package collection_demo;

import java.util.LinkedList;
import java.util.Stack;

public class QueueExample {
    public static void main(String[] args) {
        // FIFO
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");

        System.out.println("Tasks queue: "+ tasks);
        // Process task
        while (!tasks.isEmpty()){
            System.out.println("Processing: "+ tasks.poll());
        }

        // LIFO
        Stack<String> stack = new Stack<>();
        stack.add("Task 1");
        stack.add("Task 2");
        stack.add("Task 3");

        System.out.println("Stack order: "+ stack);
        // Process task
        while (!stack.isEmpty()){
            System.out.println("Processing: "+ stack.pop());
        }
    }
}
