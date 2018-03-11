/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetclab2;

/**
 *
 * @author Carlos
 */
import projetclab2.Empleado; 
import java.util.ArrayList; 


public class Listempleados {
    private ArrayList listaE;
    private int posicion; // Última posición.

    public Listempleados () {
        listaE = new ArrayList();
        posicion = -1;
    }

    public void addEmpleado (Empleado empleado) {
        listaE.add(empleado);
        ++posicion;
    }

    public Empleado getEmpleado (int pos) {
        if(pos>=0 && pos<=posicion)
            return listaE.get(pos);
        return null;
    }

    public int getPosicion () {
        return posicion;
    }

    @Override
    public String toString () {
        String cadena = "";
        for(int i=0; i<=posicion; i++)
            cadena += "\n\tEmpleado " + (i+1) + ":\n" + listaE.get(i);
        return cadena;
    }
}