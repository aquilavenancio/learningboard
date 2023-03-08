package com.aquila.learningboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aquila.learningboard.entyties.Project;

public interface ProjectRepository extends JpaRepository<Long, Project>{
    
    
}
