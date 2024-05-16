package com.assessment.automatedtaskscheduler.controllers;

import com.assessment.automatedtaskscheduler.models.Engineer;
import com.assessment.automatedtaskscheduler.models.RequestBodyLists;
import com.assessment.automatedtaskscheduler.models.Skills;
import com.assessment.automatedtaskscheduler.models.Task;
import com.assessment.automatedtaskscheduler.repositories.EngineerRepository;
import com.assessment.automatedtaskscheduler.repositories.SkillsRepository;
import com.assessment.automatedtaskscheduler.repositories.TaskRepository;
import com.assessment.automatedtaskscheduler.services.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Controller {
    @Autowired
    EngineerRepository engineerRepository;
    @Autowired
    TaskRepository taskRepository;
    @Autowired
    SkillsRepository skillsRepository;
    @Autowired
    SchedulerService schedulerService;

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

    @GetMapping("/assign/allTasks")
    public Map<String, String> assingAllTasks() {
        return schedulerService.scheduleAllTasks();
    }

    @PostMapping("/assign/specificTasks")
    public Map<String, String> assingAllTasks(@RequestBody RequestBodyLists requestBodyLists) {
        return schedulerService.assignTasks(requestBodyLists.getEngineers(), requestBodyLists.getTasks());
    }
}
