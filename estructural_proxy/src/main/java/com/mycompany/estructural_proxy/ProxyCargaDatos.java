/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructural_proxy;

/**
 *
 * @author AULAFISI
 */
public class ProxyCargaDatos implements CargaDatos {

    private ImplemCargaDatos cargaProceso;
    private String nombreBD;

    public ProxyCargaDatos(String nombreBD) {
        this.nombreBD = nombreBD;
    }
    
    @Override
    public void proceso() {
        if (cargaProceso == null) {
            cargaProceso = new ImplemCargaDatos(nombreBD);
        }
        cargaProceso.proceso();
    }
    
}
