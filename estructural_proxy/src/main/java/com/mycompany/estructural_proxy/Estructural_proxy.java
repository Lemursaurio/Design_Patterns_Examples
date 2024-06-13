/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estructural_proxy;

/**
 *
 * @author AULAFISI
 */
public class Estructural_proxy {

    public static void main(String[] args) {
        CargaDatos procesoCarga = new ProxyCargaDatos("bd_alumnos");

        System.out.println("La base de datos será cargada desde disco");
        procesoCarga.proceso();

        System.out.println("-----------------");
        
        System.out.println("La base de datos no será cargada desde disco");
        procesoCarga.proceso();
    }
}
