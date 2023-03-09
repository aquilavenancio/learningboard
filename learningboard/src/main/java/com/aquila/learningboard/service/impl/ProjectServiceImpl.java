package com.aquila.learningboard.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aquila.learningboard.business.ProjectBusiness;
import com.aquila.learningboard.business.impl.BusinessException;
import com.aquila.learningboard.entyties.Project;
import com.aquila.learningboard.repository.ProjectRepository;
import com.aquila.learningboard.service.ProjectService;

@Component
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository repository;

    @Autowired
    private ProjectBusiness projectBusiness;

    @Override
    public Project save(Project project) {
        if(projectBusiness.validateMandatoryFields(project)){
            return repository.save(project);
        }else{
            throw new BusinessException("O preenchimento dos campos nome, descricao e data de inicio é obrigatório!");
        }        
    }

    @Override
    public Project findById(Long id) {
        Optional<Project> projectReturn = repository.findById(id);
        return projectReturn.isPresent() ? projectReturn.get() : null;
    }

    @Override
    public List<Project> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Project> findBetweenDate(LocalDate startDate, LocalDate endDate) {
        if(startDate != null && endDate != null ){
           return repository.findBetweenDate(startDate, endDate); 
        }else{
            throw new BusinessException("Nenhum registro encontrado!");
        }
    }
    
}
