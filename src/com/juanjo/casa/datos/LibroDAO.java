/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.datos;
import com.juanjo.casa.negocio.Libro;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JuanJo
 */
public interface LibroDAO {
    Libro create();
    void insert(Libro libro) throws BussinessException;
    Libro get(int idLibro) throws BussinessException;
    void update(Libro libro) throws BussinessException;
    void delete (int idLibro) throws BussinessException;
    List<Libro> find(Map<String, Object> filter) throws BussinessException;
    
}
