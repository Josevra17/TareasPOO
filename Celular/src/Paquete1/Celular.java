/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Celular {
    String nombre;
    String color;
    Scanner vr = new Scanner(System.in);
    public Celular(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    public void llamar(){
        System.out.println("LLamando de: "+nombre+" - "+color);
}
    public void detalleCelular(){
        System.out.println("----------------------------------------------------");
        System.out.println("Modelo: "+ nombre);
        System.out.println("Color: "+ color );
        System.out.println("----------------------------------------------------");
    }
    
}
