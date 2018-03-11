/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetclab2;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Listempleados {
    private ArrayList listaE;
    private int posicion;
    
    public Listempleados(){
        listaE = new ArrayList();
        posicion = -1;
    }
    
    
    public void addEmpleado (Empleado empleado){
        listaE.add(empleado);
        ++posicion;
    }
    
    public Empleado getEmpleado (int pos){
        if(pos >= 0 && pos <=posicion)
            return (Empleado) listaE.get(pos);
        return null;
        
        
    }
}
