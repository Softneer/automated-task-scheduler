package com.assessment.automatedtaskscheduler.controllers;

import com.assessment.automatedtaskscheduler.models.Engineer;
import com.assessment.automatedtaskscheduler.models.Skills;
import com.assessment.automatedtaskscheduler.models.Task;
import com.assessment.automatedtaskscheduler.repositories.EngineerRepository;
import com.assessment.automatedtaskscheduler.repositories.SkillsRepository;
import com.assessment.automatedtaskscheduler.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    EngineerRepository engineerRepository;
    @Autowired
    TaskRepository taskRepository;
    @Autowired
    SkillsRepository skillsRepository;

    @GetMapping("/fetch/engineers")
    public List<Engineer> getAllEngineers() {
        return engineerRepository.findAll();
    }

    @GetMapping("/fetch/tasks")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/fetch/skills")
    public List<Skills> getAllSkills() {
        return skillsRepository.findAll();
    }
}
