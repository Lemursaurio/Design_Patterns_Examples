/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructor_singleton;

/**
 *
 * @author utente
 */
public class Singleton {
    private static Singleton instance;
    public String value;

    // Private para que no se le pueda llamar normalmente
    private Singleton(String value) {
        this.value = value;
    }
    
    public static Singleton getInstance(String value) {
        if (instance == null)
        {
            instance = new Singleton(value);
        }
        return instance;
    }
}
