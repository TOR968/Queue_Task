package codefinity.taskManager.taskManagerImpl;

import codefinity.taskManager.Task;
import codefinity.taskManager.TaskProcessorService;
import codefinity.taskManager.TaskQueueService;

public class TaskProcessorServiceImpl implements TaskProcessorService {

    private final TaskQueueService taskQueueService;

    public TaskProcessorServiceImpl(TaskQueueService taskQueueService) {
        this.taskQueueService = taskQueueService;
    }

    @Override
    public void processTasks() {
        while (!taskQueueService.isEmpty()) {
            Task task = taskQueueService.getNextTask();
            System.out.println("Processing task: " + task + ";");
        }

        System.out.println("All tasks processed successfully");
    }
}
