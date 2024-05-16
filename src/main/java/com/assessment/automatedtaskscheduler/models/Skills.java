package com.assessment.automatedtaskscheduler.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "skills")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int skillId;
    private String skill;
    @JsonIgnore
    @ManyToMany(mappedBy = "skillsRequired")
    private List<Task> tasks;
    @JsonIgnore
    @ManyToMany(mappedBy = "skills")
    private List<Engineer> engineers;
}
