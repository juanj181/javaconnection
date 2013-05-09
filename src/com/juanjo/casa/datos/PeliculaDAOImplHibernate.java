/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.datos;

import com.juanjo.casa.negocio.Pelicula;
import java.util.List;
import java.util.Map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Administrador
 */
public class PeliculaDAOImplHibernate implements PeliculaDAO {

    @Override
    public Pelicula create() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void insert(Pelicula pelicula) {
        Session session = getSession();
        session.beginTransaction();
        session.save(pelicula); //<|--- Aqui guardamos el objeto en la base de datos.
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public Pelicula get(int idPelicula) {
        Session session = getSession();
        session.beginTransaction();
        Pelicula pelicula = (Pelicula)session.get(Pelicula.class,idPelicula);
        session.getTransaction().commit();
        session.close();
        return pelicula;
        
    }

    @Override
    public void update(Pelicula pelicula) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(int idPelicula) {
    Pelicula pelicula = get(idPelicula);
    Session session = getSession();
    session.beginTransaction();
    session.delete(pelicula);
    session.getTransaction().commit();
    session.close();
    }

    @Override
    public List<Pelicula> find(Map<String, Object> filtro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private Session getSession() {
        SessionFactory sessionFactory;

        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        Session session = sessionFactory.openSession();

        return session;
    }
}
