package com.assessment.automatedtaskscheduler.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestBodyLists {
    private List<Engineer> engineers;
    private List<Task> tasks;
}
