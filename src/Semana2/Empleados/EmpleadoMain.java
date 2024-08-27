/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana2.Empleados;

/**
 *
 * @author labf402
 */
public class EmpleadoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        
        String name = "Juan";
        String LastName = "Martimez";
        int Age = 12;
        
        emp.Register(name, LastName, Age);
        
        emp.Mostrar();
    }
    
}
