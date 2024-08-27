/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2.Celular;

/**
 *
 * @author labf402
 */
public class Celular {
    private String name, model;
    private float price;
    
    public void registrar()
    {
        System.out.println("Ingrese el nombre del celular: ");
        this.name = LeerCadena.Lector();
        System.out.println("Ingrese el modelo del telefono: ");
        this.model = LeerCadena.Lector();
        System.out.println("Ingresa el precio del celular: ");
        this.price = Float.parseFloat(LeerCadena.Lector());        
    }
    public void mostrar()
    {
        System.out.println("Nombre: " + name);
        System.out.println("Modelo: "+ model);
        System.out.println("Precio: " + price);
    }
}
