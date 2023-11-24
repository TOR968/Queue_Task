# Queue Task

Your task is to implement the `TaskProcessorServiceImpl` class,
which will have only one method - `processTasks()`. 
This method should process all tasks from the passed `taskQueueService` queue. 
Use the methods of this interface to achieve the result.

Instructions:
1. First, you should use composition and create an instance of the `TaskQueue` class. Then, also add its initialization in the constructor.
2. Next, implement the `TaskProcessorImpl` interface and override its methods.
3. In the implementation of the interface, use a `while` loop with the `isEmpty()` method as the condition.
4. Inside the `while` loop, use the `taskQueueService.getNextTask()` method, indicating that the task is completed. Output information to the screen using `System.out.println()` - "Processing Task: " + task.
5. When the loop finishes its work, output "All tasks processed." to the screen.
6. Run the tests and check the correctness of your solution.