package codefinity.taskManager.taskManagerImpl;

import codefinity.taskManager.Task;
import codefinity.taskManager.TaskProcessor;

public class TaskProcessorImpl implements TaskProcessor {
    private TaskQueueImpl taskQueueImpl;

    public TaskProcessorImpl(TaskQueueImpl taskQueueImpl) {
        this.taskQueueImpl = taskQueueImpl;
    }

    @Override
    public void processTasks() {
        while (!taskQueueImpl.isEmpty()) {
            Task task = taskQueueImpl.getNextTask();
            System.out.println("Processing Task: " + task);
        }
        System.out.println("All tasks processed.");
    }
}