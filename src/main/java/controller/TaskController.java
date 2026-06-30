package controller;

import com.jysk.taskmanager.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class TaskController {


    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public String showTaskList(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());

        return "task-list"; // returns the name of the frontend html
    }

    @GetMapping("/new")
    public String showCreateForm(Model model){
    }
}

