package com.aquila.learningboard.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aquila.learningboard.entyties.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
    

    @Query("from Project pjt where pjt.startDate between :start and :end ")
    List<Project> findBetweenDate(@Param("start") LocalDate startDate, @Param("end")LocalDate endDate);
}
