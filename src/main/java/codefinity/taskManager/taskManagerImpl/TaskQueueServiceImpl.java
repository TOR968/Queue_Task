package codefinity.taskManager.taskManagerImpl;

import codefinity.taskManager.Task;
import codefinity.taskManager.TaskQueueService;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueueServiceImpl implements TaskQueueService {
    private final Queue<Task> taskQueue = new LinkedList<>();

    @Override
    public void addTask(Task task) {
        taskQueue.offer(task);
    }

    @Override
    public Task getNextTask() {
        return taskQueue.poll();
    }

    @Override
    public boolean isEmpty() {
        return taskQueue.isEmpty();
    }
}
