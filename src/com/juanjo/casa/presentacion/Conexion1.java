/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.presentacion;

import com.juanjo.casa.datos.BussinesException;
import com.juanjo.casa.datos.BussinessMessage;
import com.juanjo.casa.datos.PeliculaDAO;
import com.juanjo.casa.datos.LibroDAO;
import com.juanjo.casa.datos.PeliculaDAOImplHibernate;
import com.juanjo.casa.datos.PeliculaDAOImplJDBC;
import com.juanjo.casa.datos.LibroDAOImplJDBC;
import com.juanjo.casa.negocio.Pelicula;
import com.juanjo.casa.negocio.Libro;
import javax.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author JuanJo
 */
public class Conexion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();        
        pelicula.setIdPelicula(6);
        pelicula.setTitulo("El pianista");
        
        
        
        Libro libro = new Libro();
        libro.setIdLibro(12);
        libro.setTitulo("El señor de los anillos");
        
        ApplicationContext context =new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        
        try{
        PeliculaDAO peliculaDAO = new PeliculaDAOImplHibernate();
      //  LibroDAO libroDAO = new LibroDAOImplJDBC();  
     //   peliculaDAO.delete(6);
        peliculaDAO.insert(pelicula);
         
       // libroDAO.insert(libro);
        } catch (BussinessException be) {
        //    session.getTransaction().rollback();
            System.out.println("No se ha podido insertar la pelicula");
            for(BussinessMessage bussinesMessage : be.getBussinessMessages()){
                System.out.println(bussinesMessage.getFieldName()+"-"+bussinessMessage.getMessage());
            }
        }
    }
}
