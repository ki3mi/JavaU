/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana2.Celular;

/**
 *
 * @author labf402
 */
public class CelularMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Celular cel = new Celular();
        
        cel.registrar();
        System.out.println("Celular registrado: ");
        cel.mostrar();
        
    }
    
}
