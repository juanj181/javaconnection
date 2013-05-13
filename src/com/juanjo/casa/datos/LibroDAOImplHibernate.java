/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.datos;

import com.juanjo.casa.negocio.Libro;
import com.juanjo.casa.negocio.Pelicula;
import java.util.List;
import java.util.Map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Administrador
 */
public class LibroDAOImplHibernate implements LibroDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public Libro create() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    @Override
    public void insert(Libro libro) {
        Session session = getSession();
        session.beginTransaction();

        session.save(libro); //<|--- Aqui guardamos el objeto en la base de datos.

        session.getTransaction().commit();
        session.close();

    }

    @Override
    public Libro get(int idLibro) {
        Session session = getSession();
        session.beginTransaction();
        Libro libro = (Libro)session.get(Libro.class,idLibro);
        session.getTransaction().commit();
        session.close();
        return libro;
    }

    
    @Override
    public void update(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    @Override
    public void delete(int idLibro) {
    Libro libro = get(idLibro);
    Session session = getSession();
    session.beginTransaction();
    session.delete(libro);
    session.getTransaction().commit();
    session.close();
    }

    
    @Override
    public List<Libro> find(Map<String, Object> filtro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private Session getSession() {
        Session session = sessionFactory.getCurrentSession();

        return session;
    }
}
