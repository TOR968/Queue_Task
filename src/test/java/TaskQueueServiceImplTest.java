import codefinity.taskManager.Task;
import codefinity.taskManager.taskManagerImpl.TaskQueueServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskQueueServiceImplTest {
    private TaskQueueServiceImpl taskQueueService;

    @Before
    public void setUp() {
        taskQueueService = new TaskQueueServiceImpl();
    }

    @Test
    public void testAddTask() {
        Task task = new Task(1, "Test Task", "Description");
        taskQueueService.addTask(task);

        assertFalse(taskQueueService.isEmpty());
    }

    @Test
    public void testGetNextTask() {
        Task task = new Task(1, "Test Task", "Description");
        taskQueueService.addTask(task);

        Task retrievedTask = taskQueueService.getNextTask();

        assertEquals(task, retrievedTask);
        assertTrue(taskQueueService.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(taskQueueService.isEmpty());

        Task task = new Task(1, "Test Task", "Description");
        taskQueueService.addTask(task);

        assertFalse(taskQueueService.isEmpty());
    }
}
