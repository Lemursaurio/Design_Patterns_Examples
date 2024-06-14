/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comportamiento.chain.of.responsability;

/**
 *
 * @author utente
 */
public class Request {
    private Priority priority;
    
    public Request(Priority priority) {
        this.priority = priority;
    }
    
    public Priority getPriority() {
        return priority;
    }
}
