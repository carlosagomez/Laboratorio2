/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetclab2;

import projetclab2.Listempleados;
import projetclab2.*;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author DiegoAlexanderDimasVasquez
 */
public class Aplication {

    int opt;
    Listempleados ListaContratados = new Listempleados();
    Listempleados ListaDestajos = new Listempleados();
    private static Scanner Lector = new Scanner(System.in);
    public static final short CONTRATADO = 0;
    public static final short POR_DESTAJO = 1;

    private static String Leer(String msje)
    {
        System.out.print(msje+": ");
        return Lector.nextLine();
    }

    private void Leer(int Type)
    {
        String dui = Leer("Ingrese su DUI");
        String nombre = Leer("Ingrese su nombre");
        String apellidos = Leer("Ingrese sus apellidos");
        System.out.println("Ingrese fecha de ingreso:");
        int anio = Integer.parseInt( Leer("Año") );
        int mes = Integer.parseInt( Leer("Mes (1-12)") );
        int dia = Integer.parseInt( Leer("Día") );
        GregorianCalendar fechaIngreso = new GregorianCalendar(anio,mes-1,dia);

        if(Type == CONTRATADO)
        {
            int salarioB = Integer.parseInt( Leer("Ingrese salario base") );
            ListaContratados.addEmpleado( new EContratado(dui, nombre, apellidos, fechaIngreso, salarioB) );
        }else{
            int clientesObtenidos = Integer.parseInt( Leer("Ingrese clientes reclutados") );
            ListaDestajos.addEmpleado( new EDestajo(dui, nombre, apellidos, fechaIngreso, clientesObtenidos) );
        }
    }

    private void MostrarSalarios()
    {
        System.out.println("Salarios de los empleados contratados: ");
        for(int i=0; i<=ListaContratados.getPosicion(); ++i)
            System.out.println( ListaContratados.getEmpleado(i) );
        System.out.println("Salarios de los empleados por destajo: ");
        for(int i=0; i<=ListaDestajos.getPosicion(); ++i)
            System.out.println( ListaDestajos.getEmpleado(i) );
    }


    private int Menu()
    {
        System.out.print(
          "MENU DE OPCIONES\n"
        + "---- -- --------\n"
        + "1. Registrar empleados contratados.\n"
        + "2. Registrar empleados a destajo.\n"
        + "3. Mostrar salarios por empleado.\n"
        + "4. Salir.\n");
        return Integer.parseInt( Leer("Seleccione opción") );
    }

    private void Accionar(int opt)
    {
        switch(opt)
        {
            case 1:
                Leer(CONTRATADO);
                break;
            case 2:
                Leer(POR_DESTAJO);
                break;
            case 3:
                MostrarSalarios();
                break;
            case 4:
                System.out.println("Cerrando programa . . .");
                break;
            default:
                System.err.println("Al menos ingresa una opción válida ._.");
        }
    }

    public void Ejecutar () {

        do{
            opt = Menu();
            Accionar(opt);
        }while(opt!=4);
        
    }
}