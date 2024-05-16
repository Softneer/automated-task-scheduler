package com.assessment.automatedtaskscheduler.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "engineers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engineer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int engineerId;
    private String name;
    private boolean availability;
    @ManyToMany
    @JoinTable(
            name = "engineer_skills",
            joinColumns = @JoinColumn(name = "engineerId"),
            inverseJoinColumns = @JoinColumn(name = "skillId")
    )
    private List<Skills> skills;
}
