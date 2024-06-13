/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructor_prototype;

/**
 *
 * @author AULAFISI
 */
public class Profesor extends Persona {
    public Boolean contratado;
    
    public Profesor() {
    }
    
    public Profesor(Profesor prof) {
      super(prof);
      if (prof != null) {
        this.contratado = prof.contratado;
      }
    }
    
    @Override
    public Profesor clone() {
      return new Profesor(this);
    }
    
    @Override
    public boolean equals(Object object2) {
      if (!(object2 instanceof Profesor) || !super.equals(object2)) return false;
      Profesor Persona2 = (Profesor) object2;
      return Persona2.contratado == contratado;
    }
}
