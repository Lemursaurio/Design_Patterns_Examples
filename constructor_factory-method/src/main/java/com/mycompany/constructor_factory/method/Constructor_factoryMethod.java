/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.constructor_factory.method;

import java.util.Scanner;

/**
 *
 * @author AULAFISI
 */
public class Constructor_factoryMethod {

    private static Base_de_Datos bd;
    
    public static void main(String[] args) {
        System.out.println("BD: 1 para agregar, 0 para eliminar");
        configure();
        accederBD();
    }
    
    static void configure() {
        Scanner sc = new Scanner(System.in);
        int opc = sc.nextInt();
        
        if (opc == 1)
            bd = new Operacion_agregar();
        else {
            bd = new Operacion_eliminar();
        }
    }
    
    static void accederBD() {
        bd.acceder_datos();
    }
}
