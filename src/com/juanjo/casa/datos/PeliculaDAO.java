/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.datos;

import com.juanjo.casa.negocio.Pelicula;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JuanJo
 */
public interface PeliculaDAO {
    Pelicula create();
    void insert(Pelicula pelicula);
    Pelicula get(int idPelicula);
    void update(Pelicula pelicula);
    void delete(int idPelicula);
    List<Pelicula> find(Map<String,Object> filter); 
}

