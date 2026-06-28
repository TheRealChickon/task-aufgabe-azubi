package com.jysk.taskmanager.repository;

import com.jysk.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

// entity, data type of entitys primary key, Id
public interface TaskRepository extends JpaRepository<Task, Long> {




    // repository.findAll() (returns a list of Task objects)
    //
    //repository.findById(Long id) (searches using a Long ID)
    //
    //repository.save(Task task) (saves a Task object)




}

