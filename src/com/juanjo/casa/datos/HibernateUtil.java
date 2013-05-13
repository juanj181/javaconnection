/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.datos;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Administrador
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;
    
    public static void buildSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}
