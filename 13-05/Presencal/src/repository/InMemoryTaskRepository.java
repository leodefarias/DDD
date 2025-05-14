package repository;
import domain.Task;

import java.util.*;


public class InMemoryTaskRepository implements TaskRepository {
    private final Map<String, Task> storage = new HashMap<>();

    public void save(Task task) {
        storage.put(task.getId(), task);
    }

    public Task findById(String id) {
        return storage.get(id);
    }
}
