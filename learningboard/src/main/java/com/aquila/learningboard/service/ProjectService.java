package com.aquila.learningboard.service;

import java.time.LocalDate;
import java.util.List;

import com.aquila.learningboard.entyties.Project;

public interface ProjectService {

    Project save(Project project);
    Project findById(Long id);
    List<Project> findAll();
    List<Project> findBetweenDate(LocalDate startDate, LocalDate endDate);    

}
