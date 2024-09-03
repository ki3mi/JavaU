/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3.HerenciaAlumno;

/**
 *
 * @author labf402
 */
public class Alumno_Inst extends Alumno {
    private String espec;
    
    public void regDatos(int n_codigo, String n_nombre, String n_espec)
    {
        super.registrar(n_codigo, n_nombre);
        espec = n_espec;
    }
    public void condatos()
    {
        super.consultar();
        System.out.println("Especialidad: " + espec + "\n");
    }
}
