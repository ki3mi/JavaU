/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3.AbstractClass;

/**
 *
 * @author labf402
 */
public final class Cuadrado extends Figura {
    public int lado;
    
    public Cuadrado(int ldo)
    {
        this.lado = ldo;
    }
    
    public double area()
    {
        return (Math.pow(lado, 2));
    }
    
}
