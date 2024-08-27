/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2.Empleados;

/**
 *
 * @author labf402
 */
public class Empleado {
    private String Name;
    private String LastName;
    private int Age;
    
    public void Register(String Name, String LastName, int Age)
    {
        this.Name = Name;
        this.LastName = LastName;
        this.Age = Age;
    }
    public void Mostrar()
    {
        System.out.println("Tu nombre es: " + Name);
        System.out.println("Tu apellido es: "+ LastName);
        System.out.println("Tu edad es: "+Age);
    }
}
