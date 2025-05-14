import domain.Task;
import repository.TaskRepository;
import services.TaskService;
import repository.InMemoryTaskRepository;
import repository.impl.TaskServiceImpl;

public class ConsoleApp {
    public static void main(String[] args) {
        TaskRepository repo = new InMemoryTaskRepository();
        TaskService service = new TaskServiceImpl(repo);

        service.createTask("1", "Estudar arquitetura hexagonal");
        service.completeTask("1");

        Task task = repo.findById("1");
        System.out.println("Tarefa: " + task.getDescription() + "| Concluída: " + task.isCompleted());
    }
}
