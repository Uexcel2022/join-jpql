package com.uexcel.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;

public class CustomEntityManager {

    public static EntityManager getEntityManager() {
        Map<String, String> properties = new HashMap<>();
        properties.put("hibernate.show_sql", "true");
        // properties.put("hibernate.hbm2ddl.auto", "create");

        EntityManagerFactory entityManagerFactory = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(), properties);

        return entityManagerFactory.createEntityManager();
    }

}
