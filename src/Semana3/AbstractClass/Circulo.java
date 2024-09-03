/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3.AbstractClass;

/**
 *
 * @author labf402
 */
public final class Circulo extends Figura{
    public int radio;
    
    public Circulo(int rdo)
    {
        this.radio = rdo;
    }
    
    public double area()
    {
        return (Math.PI * Math.pow(radio, 2));
    }
}
