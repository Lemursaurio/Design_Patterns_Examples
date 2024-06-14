/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constructor_singleton;

/**
 *
 * @author utente
 */
public class Constructor_singleton {

    public static void main(String[] args) {
        System.out.println("Si se ven valores diferentes, es porque se crearon 2 instancias diferentes");
        Singleton singleton1 = Singleton.getInstance("Foo");
        Singleton singleton2 = Singleton.getInstance("Bar");
        
        System.out.println(singleton1.value);
        System.out.println(singleton2.value);
    }
}
