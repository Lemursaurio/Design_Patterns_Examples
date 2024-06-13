/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructor_factory.method;

/**
 *
 * @author AULAFISI
 */
public class Operacion_agregar extends Base_de_Datos{

    @Override
    public Operacion realizarOperacion() {
        return new Agregar();
    }
    
}
