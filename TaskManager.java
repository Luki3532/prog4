
import java.util.Scanner;

public class TaskManager {
    private PriorityQueue queue; // The queue to hold tasks

    public TaskManager() {
        queue = new PriorityQueue(); // Initialize the priority queue
    }

    public void addTask(String task, int priority) {
        // Add a task with a given priority to the queue
        // queue.enqueue(task, priority);
    }

    public String getNextTask() {
        // Get the next task from the queue
        return queue.dequeue();
    }

    public String peekNextTask() {
        // Peek at the next task without removing it from the queue
        return queue.peek();
    }

    public int peekNextTaskPriority() {
        // Peek at the priority of the next task without removing it from the queue
        return queue.peekPriority();
    }

    public void clearTasks() {
        // Clear all tasks from the queue
        queue.clear();
    }

    public int getTaskCount() {
        // Get the number of tasks in the queue
        return queue.size();
    }

    public boolean isEmpty() {
        // Check if the queue is empty
        return queue.isEmpty();
    }
} // end TaskManager class

class PriorityQueue {

    public static class PqTest {

        Scanner readUser = new Scanner(System.in);

        // Create a new PriorityQueue object
        public PqTest() {
            PriorityQueue queue = new PriorityQueue();
        }

        // Test class for the PriorityQueue
        public static void main(String[] args) {
            PriorityQueue.PqTest test = new PriorityQueue.PqTest();
            while (true) {
                if (test.printMenu() == 0) {
                    System.out.println("Exiting the program.");
                    break; // Exit the program
                } else if (test.printMenu() == 1) {
                    System.out.println("Enqueue a task.");
                    // Add a task to the queue
                } else if (test.printMenu() == 2) {
                    System.out.println("Dequeue a task.");
                    // Remove a task from the queue
                } else if (test.printMenu() == 3) {
                    System.out.println("Peek at the most urgent task.");
                    // Peek at the most urgent task
                } else if (test.printMenu() == 4) {
                    System.out.println("Peek at the priority of the most urgent task.");
                    // Peek at the priority of the most urgent task
                } else if (test.printMenu() == 5) {
                    System.out.println("Clear the queue of all elements.");
                    // Clear all tasks from the queue
                } else if (test.printMenu() == 6) {
                    System.out.println("Return the number of tasks in the queue.");
                    // Get the number of tasks in the queue
                } else if (test.printMenu() == 7) {
                    System.out.println("Determine if the queue is empty.");
                    // Check if the queue is empty
                } else {
                    System.out.println("Invalid choice. Please try again.");

                }
            }
        }

        public int printMenu() {
            System.out.println("Type a choice from the menu:");
            System.out.println("0) EXIT the program.");
            System.out.println("1) Enqueue a task.");
            System.out.println("2) Dequeue a task.");
            System.out.println("3) Peek at the most urgent task.");
            System.out.println("4) Peek at the priority of the most urgent task.");
            System.out.println("5) Clear the queue of all elements.");
            System.out.println("6) Return the number of tasks in the queue.");
            System.out.println("7) Determine if the queue is empty.");
            System.out.print("Enter your choice: ");
            return readUser.nextInt();
        }
    }

    public void enqueue() {

        // Add a task to the queue with a given priority
        // The task with the highest priority (lowest number) will be dequeued first
        // If two tasks have the same priority, the one that was added first will be
        // dequeued first
        // If the queue is full, throw an exception()
    }

    public String dequeue() {
        return "AAA";
        // Remove and return the task with the highest priority (lowest number)
        // If the queue is empty, throw an exception()

    }

    public String peek() {
        return "AAA";

    }

    public int peekPriority() {
        return 11;

    }

    public void clear() {

    }

    public int size() {
        return 11;

    }

    public boolean isEmpty() {
        return true;
    }
}