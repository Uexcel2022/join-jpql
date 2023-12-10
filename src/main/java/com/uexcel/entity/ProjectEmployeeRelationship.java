package com.uexcel.entity;

import java.io.Serializable;

public class ProjectEmployeeRelationship implements Serializable {
    private Long employee_id;
    private Long project_id;

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public Long getProject_id() {
        return project_id;
    }

    public void setProject_id(Long project_id) {
        this.project_id = project_id;
    }

    @Override
    public String toString() {
        return "ProjectEmployeeRelationship{" +
                "employee_id=" + employee_id +
                ", project_id=" + project_id +
                '}';
    }
}
