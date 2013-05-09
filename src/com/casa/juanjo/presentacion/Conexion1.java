/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casa.juanjo.presentacion;

import com.juanjo.casa.datos.PeliculaDAO;
import com.juanjo.casa.datos.LibroDAO;
import com.juanjo.casa.datos.PeliculaDAOImplHibernate;
import com.juanjo.casa.datos.PeliculaDAOImplJDBC;
import com.juanjo.casa.datos.LibroDAOImplJDBC;
import com.juanjo.casa.negocio.Pelicula;
import com.juanjo.casa.negocio.Libro;
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
        pelicula.setTitulo("Iron_Man");
        
        Libro libro = new Libro();
        libro.setIdLibro(12);
        libro.setTitulo("El señor de los anillos");
        
        
        PeliculaDAO peliculaDAO = new PeliculaDAOImplHibernate();
        LibroDAO libroDAO = new LibroDAOImplJDBC();
        
        peliculaDAO.delete(6);
        peliculaDAO.insert(pelicula);
        libroDAO.insert(libro);
    }
}
