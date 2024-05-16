package com.assessment.automatedtaskscheduler.services;

import com.assessment.automatedtaskscheduler.models.Engineer;
import com.assessment.automatedtaskscheduler.models.RequestBodyLists;
import com.assessment.automatedtaskscheduler.models.Task;
import com.assessment.automatedtaskscheduler.repositories.EngineerRepository;
import com.assessment.automatedtaskscheduler.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SchedulerService {
    @Autowired
    TaskRepository taskRepository;
    @Autowired
    EngineerRepository engineerRepository;

    public Map<String, String> scheduleAllTasks() {
        return this.assignTasks(this.getAllEngineers(), this.getAllTasks());
    }

    public Map<String, String> assignTasks(List<Engineer> engineersList, List<Task> tasksList) {
        Map<String, String> assignmentMap = new HashMap<>();

        for (Task task : tasksList) {
            boolean assigned = false;

            for (Engineer engineer : engineersList) {
                if (engineer.isAvailability() && engineer.getSkills().containsAll(task.getSkillsRequired())) {
                    assignmentMap.put(task.getTitle(), engineer.getName());
                    engineer.setAvailability(false); // Mark engineer as unavailable after assignment
                    assigned = true;
                    break;
                }
            }

            if (!assigned) {
                assignmentMap.put(task.getTitle(), "Unassigned");
            }
        }

        return assignmentMap;
    }

    public List<Engineer> getAllEngineers() {
       return engineerRepository.findAll();
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
