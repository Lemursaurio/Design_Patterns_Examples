/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructor_prototype;

import java.util.Objects;

/**
 *
 * @author AULAFISI
 */
public class Alumno extends Persona{

    public String facultad;
    
    public Alumno() {
    }
    
    public Alumno(Alumno al) {
      super(al);
      if (al != null) {
        this.facultad = al.facultad;
      }
    }
    
    @Override
    public Persona clone() {
      return new Alumno(this);
    }
    
    @Override
    public boolean equals(Object object2) {
      if (!(object2 instanceof Alumno) || !super.equals(object2)) return false;
      Alumno Persona2 = (Alumno) object2;
      return Objects.equals(Persona2.facultad, facultad);
    }  
}
