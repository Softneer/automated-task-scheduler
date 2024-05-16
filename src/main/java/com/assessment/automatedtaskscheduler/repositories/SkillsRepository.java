package com.assessment.automatedtaskscheduler.repositories;

import com.assessment.automatedtaskscheduler.models.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Integer> {
}
