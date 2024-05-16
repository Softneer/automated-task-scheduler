package com.assessment.automatedtaskscheduler.repositories;

import com.assessment.automatedtaskscheduler.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
