package com.aquila.learningboard.business;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.aquila.learningboard.business.impl.ProjectBusinessImpl;
import com.aquila.learningboard.entyties.Project;

@SpringBootTest
public class ProjectBusinessTest {
    
    @InjectMocks
    private ProjectBusinessImpl businessMock;


    @Test
    public void validateMandatoryFiedsTest(){

        Project projectTest = Project
                .builder()
                    .name("Projeto Base Test")
                    .description("Projeto para validar campos")
                    .startDate(LocalDate.now())
                    .build();

        boolean validate = businessMock.validateMandatoryFields(projectTest);                    

        assertTrue(validate);
    }

}
