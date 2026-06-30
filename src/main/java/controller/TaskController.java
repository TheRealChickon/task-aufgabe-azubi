package controller;

import com.jysk.taskmanager.model.Task;
import com.jysk.taskmanager.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class TaskController {


    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks") // GET lesen
    public String showTaskList(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());

        return "task-list"; // returns the name of the frontend html
    }

    @GetMapping("/tasks/new") // POST schreiben
    public String showCreateForm(Model model){
        model.addAttribute("task", new Task());
        return "task-form";
    }


    @PostMapping("tasks/{id}/delete") // {id}
    public String removeTask(@PathVariable("id") Long id) {
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }

    @PostMapping("tasks/{id}/toggle") // {id}
    public String toggleTaskStatus(@PathVariable("id") Long id) {
        taskService.toggleTask(id);
        return "redirect:/tasks";
    }
}

