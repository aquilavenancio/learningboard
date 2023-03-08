package com.aquila.learningboard.business;

import com.aquila.learningboard.entyties.Project;

public interface ProjectBusiness {
    /**
     * Validate mandatory fields has fulled return true if all mandatory fields has filled
     * and false if not.
     * @param project
     * @return
     */
   boolean validateMandatoryFields(Project project); 
}
