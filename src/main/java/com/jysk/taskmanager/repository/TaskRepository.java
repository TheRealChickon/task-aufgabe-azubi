package com.jysk.taskmanager.repository;

import com.jysk.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

// entity, data type of entitys primary key, Id type
public interface TaskRepository extends JpaRepository<Task, Long> {



    //inherits  from JpaRepository
    // repository.findAll()
    //
    //repository.findById(Long id)
    //
    //repository.save(Task task) (saves  )




}

