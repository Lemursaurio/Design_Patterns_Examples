/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comportamiento.chain.of.responsability;

/**
 *
 * @author utente
 */
public class ComportamientoChainOfResponsability {

    public static void main(String[] args) {
        Handler handler1 = new HandlerNivel1();
        Handler handler2 = new HandlerNivel2();
        Handler handler3 = new HandlerNivel3();
        
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        
        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);
        
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }
}
