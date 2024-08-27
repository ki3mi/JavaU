/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2.Practica;

/**
 *
 * @author labf402
 */
public class BoletaVenta {
    private String NombreCliente;
    private int NumBoleta, Cantidad;
    private double Precio, MontoTotal;
        
   public void Registrar()
   {
        System.out.println("Ingrese el nombre del cliente: ");
        this.NombreCliente = LeerCadena.Lector();
        System.out.println("Escriba el número de boleta: ");
        this.NumBoleta = Integer.parseInt(LeerCadena.Lector());
        System.out.println("Ingrese la cantidad: ");
        this.Cantidad = Integer.parseInt(LeerCadena.Lector());
        System.out.println("Ingrese el precio unitario: ");
        this.Precio = Double.parseDouble(LeerCadena.Lector());
        this.MontoTotal = this.Precio * this.Cantidad;
   }
   public void Mostrar()
   {       
       System.out.println("Monto Total: " + this.MontoTotal);
   }
}
