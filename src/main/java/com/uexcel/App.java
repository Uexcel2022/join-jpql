package com.uexcel;

import com.uexcel.persistence.CustomEntityManager;
import jakarta.persistence.EntityManager;

public class App
{
    public static void main( String[] args ) throws Exception {
        try(EntityManager entityManager = CustomEntityManager.getEntityManager()) {

            entityManager.getTransaction().begin();



            entityManager.getTransaction().commit();
        } catch (Exception e){
            throw  new Exception(e);
        }
    }
}
