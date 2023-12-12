package com.uexcel.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@NamedQueries(@NamedQuery(name="getAllProject",
        query = "SELECT p FROM Project  p")) // for multiple queries
@Table(name="project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="project_id")
    private Long projectId;
    @Column(name="project_name")
    private String projectName;

    @OneToMany(cascade = {CascadeType.REMOVE}, mappedBy = "project")
    private  List<ProjectExecution> projectExecution;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<ProjectExecution> getProjectExecution() {
        return projectExecution;
    }

    public void setProjectExecution(List<ProjectExecution> projectExecution) {
        this.projectExecution = projectExecution;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
