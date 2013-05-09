/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.datos;



/**
 *
 * @author alumno
 */
public class BussinessMessage {
   private  String fieldName;
   private String message;
     
     public String getFieldName(){
         return fieldName;
     }
     public String getMessage(){
         return message;
     }
    
     public void setFieldName(String fieldName){
         this.fieldName = fieldName;
     }
     
     public void setMessage(String message){
         this.message = message;
     }
    
}
