package codefinity.taskManager;

public interface TaskQueue {
    void addTask(Task task);

    Task getNextTask();

    boolean isEmpty();
}
