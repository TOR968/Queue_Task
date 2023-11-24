import codefinity.taskManager.Task;
import codefinity.taskManager.TaskQueueService;
import codefinity.taskManager.taskManagerImpl.TaskProcessorServiceImpl;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class TaskProcessorServiceImplTest {

    @Test
    public void testProcessTasksWithTasksInQueue() {
        TaskQueueService mockTaskQueueService = Mockito.mock(TaskQueueService.class);

        when(mockTaskQueueService.isEmpty()).thenReturn(false, false, true);
        when(mockTaskQueueService.getNextTask()).thenReturn(new Task(1, "Task One", "Description"), new Task(2, "Task Two", "Description"));

        TaskProcessorServiceImpl taskProcessorService = new TaskProcessorServiceImpl(mockTaskQueueService);

        taskProcessorService.processTasks();

        verify(mockTaskQueueService, times(2)).getNextTask();
        verify(mockTaskQueueService, atLeastOnce()).isEmpty();
    }

    @Test
    public void testProcessTasksWithEmptyQueue() {
        TaskQueueService mockTaskQueueService = Mockito.mock(TaskQueueService.class);
        when(mockTaskQueueService.isEmpty()).thenReturn(true);

        TaskProcessorServiceImpl taskProcessorService = new TaskProcessorServiceImpl(mockTaskQueueService);
        taskProcessorService.processTasks();

        verify(mockTaskQueueService, never()).getNextTask();
        verify(mockTaskQueueService, atLeastOnce()).isEmpty();
    }
}
