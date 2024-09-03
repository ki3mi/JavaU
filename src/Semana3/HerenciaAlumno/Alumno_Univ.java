/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3.HerenciaAlumno;

/**
 *
 * @author labf402
 */
public class Alumno_Univ extends Alumno {
    private String facultad;
    public void regDatos(int n_codigo, String n_nombre,String n_facultad)
    {
        super.registrar(n_codigo, n_nombre);
        facultad = n_facultad;
    }
    public void conDatos()
    {
        super.consultar();
        System.out.println("Facultad: " + facultad + "\n");
    }
}
