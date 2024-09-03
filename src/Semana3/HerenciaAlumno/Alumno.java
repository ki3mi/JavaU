/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3.HerenciaAlumno;

/**
 *
 * @author labf402
 */
public class Alumno {
    private int codigo; 
    private String nombre;
    
    public void registrar(int n_codigo, String n_nombre)
    {
        codigo = n_codigo;
        nombre = n_nombre;
    }
    public void consultar()
    {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: "+ nombre);
    }
}
