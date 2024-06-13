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
public abstract class Persona {
    public String dni;
    public String nombre;
    public String telefono;
    public String correo;
    
    public Persona() {
    }
    
    public Persona(Persona target) {
      if (target != null) {
        this.dni = target.dni;
        this.nombre = target.nombre;
        this.telefono = target.telefono;
        this.correo = target.correo;
      }
    }
    
    public abstract Persona clone();
    
    @Override
    public boolean equals(Object object2) {
      if (!(object2 instanceof Persona)) return false;
      Persona persona2 = (Persona) object2;
      return Objects.equals(persona2.dni, dni) && Objects.equals(persona2.nombre, nombre)
          && Objects.equals(persona2.telefono, telefono) && Objects.equals(persona2.correo, correo);
    }
}
