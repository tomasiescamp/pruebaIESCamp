/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Tomás
 */
public class Rectangulo {
    private double lado1;
    private double lado2;
    
    public Rectangulo(double l1, double l2){
        lado1 = l1;
        lado2 = l2;
    }
    //Lo he puesto así por cambiar un poco y hacerlo de otra forma.
    public double obtenerArea(){
        double resultado;
        resultado = lado1 * lado2;
        return resultado;
    }
    public double obtenerPerimetro(){
        double resultado;
        resultado = (lado1 * 2) + (lado2 * 2);
        return resultado;
    }
}
