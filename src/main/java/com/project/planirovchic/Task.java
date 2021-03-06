package com.project.planirovchic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tasks")
public class Task {
    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
