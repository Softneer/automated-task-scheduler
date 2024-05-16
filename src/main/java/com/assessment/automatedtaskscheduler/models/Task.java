package com.assessment.automatedtaskscheduler.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;
    private String title;
    @JsonProperty("skills_required")
    @ManyToMany
    @JoinTable(
            name = "task_skills",
            joinColumns = @JoinColumn(name = "taskId"),
            inverseJoinColumns = @JoinColumn(name = "skillId")
    )
    private List<Skills> skillsRequired;
    private int duration;
}
