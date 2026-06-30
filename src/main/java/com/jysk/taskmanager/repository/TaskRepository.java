package com.jysk.taskmanager.repository;

import com.jysk.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

// entity, data type of entitys primary key, Id
public interface TaskRepository extends JpaRepository<Task, Long> {



    //inherits  from JpaRepository
    // repository.findAll()
    //
    //repository.findById(Long id)
    //
    //repository.save(Task task) (saves  )




}

