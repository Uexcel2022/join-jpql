package com.uexcel;

import com.uexcel.entity.Employee;
import com.uexcel.entity.Project;
import com.uexcel.entity.ProjectExecution;
import com.uexcel.persistence.CustomEntityManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.Objects;

public class App
{
    public static void main( String[] args ) throws Exception {
        try(EntityManager entityManager = CustomEntityManager.getEntityManager()) {

            entityManager.getTransaction().begin();
//
//            ProjectExecution pe1 = new ProjectExecution();
//            ProjectExecution pe2 = new ProjectExecution();
//
//            Project project = new Project();
//            project.setProjectName("POS");
//
//
//            Employee empp1= new Employee();
//            empp1.setName("Nkechi");
//            empp1.setAddress("45, Mary land way, Ikeja");
//
//            Employee empp2= new Employee();
//            empp2.setName("Peter");
//            empp2.setAddress("45, Mary land way, Ikeja");
//
//            project.setProjectExecution(List.of(pe1,pe2));
//            empp1.setProjectExecution(pe1);
//            empp2.setProjectExecution(pe2);
//
//            pe1.setProject(project);
//            pe1.setEmployee(empp1);
//            pe2.setProject(project);
//            pe2.setEmployee(empp2);
//
//            entityManager.persist(project);
//            entityManager.persist(empp1);
//            entityManager.persist(empp2);
//            entityManager.persist(pe1);
//            entityManager.persist(pe2);





//            String emp = "SELECT e.employee_id, employee_id FROM ProjectExecution e";
//            TypedQuery<Object[]> employees = entityManager.createQuery(emp, Object[].class);
//            employees.getResultList().forEach(objects -> System.out.println(objects[0] +" " + objects[1]));
//            System.out.println(emp);

            ProjectExecution projectExecution = new ProjectExecution();
             String jpql= "SELECT p FROM ProjectExecution p";
            List<ProjectExecution> reset = entityManager.createQuery(jpql, ProjectExecution.class).getResultList();
            int projectName =0;
            for(ProjectExecution obj: reset){
                if(projectName == 0){
                    System.out.println("Project name: "+obj.getProject().getProjectName());
                    System.out.println("Names of employees on the project: ");
                    projectName++;
                }
                System.out.println(obj.getEmployee().getName());

            }

//            reset.forEach(projectExecution1 -> {
//                System.out.println("Project: "+projectExecution1.getProject().getProjectName());
//                System.out.println("Employee name: "+ projectExecution1.getEmployee().getName());
//            });

//            String emp ="SELECT p FROM Employee p";
//            List<Employee> employees = entityManager.createQuery(emp, Employee.class).getResultList();
//            System.out.println(employees);


            entityManager.getTransaction().commit();
        } catch (Exception e){
            throw  new Exception(e);
        }
    }
}
