/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comportamiento.chain.of.responsability;

/**
 *
 * @author utente
 */
public class HandlerNivel3 implements Handler {

    private Handler nextHandler;
    
    @Override
    public void handleRequest(Request request) {
      if (request.getPriority() == Priority.CRITICAL)
      {
          System.out.println("El handler de nivel 3 se encargó de este pedido");     
      }
      else if (nextHandler != null)
      {
          nextHandler.handleRequest(request);
      }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
      this.nextHandler = nextHandler;
    }
    
}
