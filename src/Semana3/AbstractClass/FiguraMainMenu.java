/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana3.AbstractClass;

import Semana3.HerenciaAlumno.Alumno_Inst;
import Semana3.HerenciaAlumno.Alumno_Univ;

/**
 *
 * @author labf402
 */
public class FiguraMainMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op, lad, rad;
        
        do{
            do {
                System.out.println("MENU");
                System.out.println("1: Cuadrado");
                System.out.println("2: Circulo");
                System.out.println("3: Salir");
                
                op = Integer.parseInt(Semana3.HerenciaAlumno.LeerCadena.Lector());
                if (op<1 || op>3) {
                    System.out.println("Error, vuelva a ingresar. \n");
                }                
            } while (op<1 || op>3);
            
            switch(op)
            {
                case 1 -> {
                    do {
                        System.out.println("Ingrese el lado del cuadrado: ");
                        lad = Integer.parseInt(LeerCadena.Lector());
                        if (lad <= 0) {
                            System.out.println("Error, vuelva a ingresar");
                        }
                    } while (lad <=0);
                    
                    Cuadrado cuad = new Cuadrado(lad);
                    System.out.println("El area del cuadrado es: " + cuad.area());
                }
                case 2 -> {
                    do {
                        System.out.println("Ingrese el radio del circulo: ");
                        rad = Integer.parseInt(LeerCadena.Lector());
                        if (rad <= 0) {
                            System.out.println("Error, vuelva a ingresar");
                        }
                    } while (rad <=0);
                    
                    Circulo cir = new Circulo(rad);
                    System.out.println("El area del cuadrado es: " + cir.area());
                }
                case 3 -> {
                    System.out.println("Gracias Vuelva pronto");
                }
            }
        }while(op != 3);
    }
    
}
