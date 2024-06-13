/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructor_factory.method;

/**
 *
 * @author AULAFISI
 */
public abstract class Base_de_Datos {
    
    public void acceder_datos() {       
        Operacion operacion  = realizarOperacion();
        operacion.operacion_bd();
    }
    
    public abstract Operacion realizarOperacion();
}
