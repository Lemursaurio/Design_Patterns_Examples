/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructural_proxy;

/**
 *
 * @author AULAFISI
 */
public class ImplemCargaDatos implements CargaDatos {

    private final String nombreBD;

    public ImplemCargaDatos(String nombreBD) {
        this.nombreBD = nombreBD;
        cargarDesdeDisco(nombreBD);
    }
    
    @Override
    public void proceso() {
        System.out.println("Cargando Base de Datos :" + nombreBD);
    }
    
     private void cargarDesdeDisco(String fileName) {
        System.out.println("Empezando el proceso de carga desde disco...");

        for (int i = 0; i < 10; i++) {
            System.out.println("Cargando " + nombreBD + " " + i * 10 + "%");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

        System.out.println("Cargada " + nombreBD);
    }
}
