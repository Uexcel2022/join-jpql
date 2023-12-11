package com.uexcel.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="project_execution")
public class ProjectExecution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long project_execution_id;

    @ManyToOne()
    @JoinColumn(name="project_id", foreignKey = @ForeignKey(name = "FK_project"))
    private Project project;

    @OneToOne()
    @JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name="FK_employee"))
    private Employee employee;

    public long getProject_execution_id() {
        return project_execution_id;
    }

    public void setProject_execution_id(long project_execution_id) {
        this.project_execution_id = project_execution_id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "ProjectExecution{" +
                "project_execution_id=" + project_execution_id +
                ", project=" + project +
                ", employee=" + employee +
                '}';
    }
}