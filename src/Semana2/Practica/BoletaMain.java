/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana2.Practica;

/**
 *
 * @author labf402
 */
public class BoletaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BoletaVenta boleta = new BoletaVenta();
        
        System.out.println("Registrando Boleta");
        boleta.Registrar();
        System.out.println("Mostrando monto total");
        boleta.Mostrar();
    }
    
}
