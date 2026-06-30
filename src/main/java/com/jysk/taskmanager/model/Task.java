package com.jysk.taskmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // JPA-Annotation not spring, tells hibernate db structure - maria -
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // automatically increment id for new tasks
    // otherwise need to increment and delete myself for every new task
    // @Column(name = "id") change name of row in hibrnate, otherwise deefault to name of variable in this_case
    private Long id;

    private String title;
    private String description;

    private boolean status = false; // titel standartmaesig offen also false


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    // db manager requires bempty constructor to create a blank  object first
    public Task() {

    }



}
