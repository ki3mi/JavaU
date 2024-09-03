/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana3.HerenciaAlumno;

/**
 *
 * @author labf402
 */
public class AlumnoMainMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op, codigo;
        String nombre, facultad, espec;
        
        Alumno_Inst a1 = new Alumno_Inst();
        Alumno_Univ a2 = new Alumno_Univ();
        
        do{
            do {
                System.out.println("MENU");
                System.out.println("1: Alumno Intituto");
                System.out.println("2: Alumno Universidad");
                System.out.println("3: Salir");
                op = Integer.parseInt(LeerCadena.Lector());
                if (op<1 || op>3) {
                    System.out.println("Error, vuelva a ingresar. \n");
                }                
            } while (op<1 || op>3);
            
            switch(op)
            {
                case 1 -> {
                    System.out.println("Ingrese el codigo: ");
                    codigo = Integer.parseInt(LeerCadena.Lector());
                    System.out.println("Ingrese el nombre: ");
                    nombre = LeerCadena.Lector();
                    System.out.println("Ingresar especialidad: ");
                    espec = LeerCadena.Lector();
                    
                    a1.regDatos(codigo, nombre, espec);
                    a1.condatos();
                }
                case 2 -> {
                    System.out.println("Ingrese el codigo: ");
                    codigo = Integer.parseInt(LeerCadena.Lector());
                    System.out.println("Ingrese el nombre: ");
                    nombre = LeerCadena.Lector();
                    System.out.println("Ingresar la facultad: ");
                    facultad = LeerCadena.Lector();
                    
                    a1.regDatos(codigo, nombre, facultad);
                    a1.condatos();
                }
                case 3 -> {
                    System.out.println("Gracias Vuelva pronto");
                }
            }
        }while(op != 3);
    }
    
}
