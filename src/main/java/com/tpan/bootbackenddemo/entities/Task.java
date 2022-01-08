package com.tpan.bootbackenddemo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Table(name = "task")
@Entity
public class Task extends TaskUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "task_id", nullable = false)
    private Long id;
    @Column(name = "task_name", nullable = false)
    private String taskName;
    @Column(name = "task_description")
    private String taskDescription;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "task_user_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "task_creator")
    private TaskUser taskCreatorId;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public TaskUser getTaskCreatorId() {
        return taskCreatorId;
    }

    public void setTaskCreatorId(TaskUser taskCreatorId) {
        this.taskCreatorId = taskCreatorId;
    }
}