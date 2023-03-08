package com.aquila.learningboard.business.impl;

import java.util.Properties;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.aquila.learningboard.business.ProjectBusiness;
import com.aquila.learningboard.entyties.Project;

@Component
public class ProjectBusinessImpl implements ProjectBusiness{

    @Override
    public boolean validateMandatoryFields(Project project) {
     
        return !ObjectUtils.isEmpty(project.getName()) && 
               !ObjectUtils.isEmpty(project.getStartDate()) &&
               !ObjectUtils.isEmpty(project.getDescription());
    }
    
    
}
