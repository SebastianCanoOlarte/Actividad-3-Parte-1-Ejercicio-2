/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3parte1ejercicionumero2;


public class Calculos {
    
    public static double Perimetro(double lado){
        return 3*lado;
    }
    public static double Altura(double lado){
        return (Math.sqrt(3)*lado)/2;
    }
    public static double Area(double lado){
        return (Math.pow(lado, 2)*Math.sqrt(3))/4;
    }
}
