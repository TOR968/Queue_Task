package codefinity.taskManager;

public interface TaskQueueService {
    void addTask(Task task);

    Task getNextTask();

    boolean isEmpty();
}
