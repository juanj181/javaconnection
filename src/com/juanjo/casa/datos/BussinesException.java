/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.datos;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author alumno
 */
public class BussinesException extends Exception{
    
    private List<BussinessMessage> bussinessMessages = new ArrayList<BussinessMessage>();

    
    
    
    public List<BussinessMessage> getBussinessMessages() {
        return bussinessMessages;
    }
    
    
    
    
    
    
}
