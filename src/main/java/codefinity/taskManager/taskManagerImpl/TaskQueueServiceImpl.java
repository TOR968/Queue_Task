package codefinity.taskManager.taskManagerImpl;

import codefinity.taskManager.Task;
import codefinity.taskManager.TaskQueue;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueueImpl implements TaskQueue {
    private Queue<Task> queue;

    public TaskQueueImpl() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void addTask(Task task) {
        queue.offer(task);
    }

    @Override
    public Task getNextTask() {
        return queue.poll();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}