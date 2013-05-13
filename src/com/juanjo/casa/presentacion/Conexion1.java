/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.presentacion;

import com.juanjo.casa.datos.BussinessException;
import com.juanjo.casa.datos.BussinessMessage;
import com.juanjo.casa.datos.PeliculaDAO;
import com.juanjo.casa.datos.LibroDAO;
import com.juanjo.casa.datos.LibroDAOImplHibernate;
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
        PeliculaDAO peliculaDAO = context.getBean(PeliculaDAO.class);
        LibroDAO libroDAO = context.getBean(LibroDAO.class);  
        peliculaDAO.delete(6);
        peliculaDAO.insert(pelicula);
         
        libroDAO.insert(libro);
        } catch (BussinessException be) {
        
            System.out.println("No se ha podido insertar la pelicula");
            for(BussinessMessage bussinessMessage : be.getBussinessMessages()){
                System.out.println(bussinessMessage.getFieldName()+"-"+bussinessMessage.getMessage());
            }
        }
    }
}
