package com.jysk.taskmanager.service;


import com.jysk.taskmanager.model.Task;
import com.jysk.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class TaskService {

    // Reihenfolge innerhalb einer Klasse (von oben nach unten) aber keine zeitliche Reihenfolge wie in einer Methode.
    // final kein befehl sondern regel fuer compiler / einmalig aenderung bzw setzung  Erst nachdem diese Zeile im
    // Konstruktor ausgeführt wurde


    private final TaskRepository taskRepository;

    //"Dependencu Injection"
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void saveTask(Task task) {
        taskRepository.save(task);
    }

    //    public void deleteTask(Task task) {
    //        taskRepository.delete(task);
    //    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id); // DELETE FROM tasks WHERE id = 5;
    }

//    public void toggleTask(Task task) {
//        // 1. Den aktuellen Boolean-Wert auslesen und umdrehen (! = Invertierung)
//        // Hinweis: Falls dein Getter in der Entity 'getStatus()' heißt, passe es kurz an.
//        task.setStatus(!task.getStatus());
//
//        // 2. Das veränderte Objekt wieder abspeichern -> JPA führt automatisch ein UPDATE aus
//        taskRepository.save(task);
//    }

    public void toggleTask(Long id){
        taskRepository.!îdkthemethod()

    }

}
