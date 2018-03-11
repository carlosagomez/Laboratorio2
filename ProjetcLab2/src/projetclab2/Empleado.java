/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetclab2;

import java.util.GregorianCalendar;

/**
 *
 * @author Carlos
 */
public class Empleado {
    String dui;
    private String nombres;
    String apellidos;
    protected GregorianCalendar fechaIngreso;
    
     public Empleado () {
        dui = "00000000";
        nombres = "NN";
        apellidos = "NA";
        fechaIngreso = new java.util.GregorianCalendar(1800,0,1);
    }

    public Empleado(String dui, String nombres, String apellidos, GregorianCalendar fechaIngreso) {
        this.dui = dui;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaIngreso = fechaIngreso;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public GregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(GregorianCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }  

    @Override
    public String toString() {
        return "Empleado{" + "dui=" + dui + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaIngreso=" + fechaIngreso + '}';
    }
    
    
}
