/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructor_abstract.factory;

/**
 *
 * @author utente
 */
public class ClassicFactory implements AbstractFactory {

    @Override
    public Mueble crearMueble() {
        return new MuebleClasico();
    }

    @Override
    public Silla crearSilla() {
        return new SillaClasica();
    }
    
}
