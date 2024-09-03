/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3.AbstractClass;
import Semana2.Practica.*;
import Semana2.Celular.*;
import java.io.*;
/**
 *
 * @author labf402
 */
public class LeerCadena {
    
    public static String Lector()
    {
        String Cadena = null;
        try{
            BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
            Cadena = data.readLine();
        }catch(IOException e){
            
        }
        
        return Cadena;
    }
}
