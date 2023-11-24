package codefinity.taskManager.taskManagerImpl;

import java.util.LinkedList;
import java.util.Queue;

public class Task {
    private int id;
    private String description;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task{id=" + id + ", description='" + description + "'}";
    }
}


