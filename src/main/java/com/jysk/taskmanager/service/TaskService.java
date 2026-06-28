package com.jysk.taskmanager.service;


import com.jysk.taskmanager.model.Task;
import com.jysk.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

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
}
