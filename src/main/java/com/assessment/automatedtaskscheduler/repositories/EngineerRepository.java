package com.assessment.automatedtaskscheduler.repositories;

import com.assessment.automatedtaskscheduler.models.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineerRepository extends JpaRepository<Engineer, Integer> {
}
