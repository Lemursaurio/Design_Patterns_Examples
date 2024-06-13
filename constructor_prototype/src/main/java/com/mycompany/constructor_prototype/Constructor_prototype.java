/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.constructor_prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AULAFISI
 */
public class Constructor_prototype {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
       
        Alumno al = new Alumno();
        al.dni = "12345678";
        al.nombre = "Pepe";
        al.telefono = "123-456-789";
        al.correo = "pepe@gmail.com";
        al.facultad = "sistemas";
        personas.add(al);

        Alumno otroAlumno = (Alumno) al.clone();
        personas.add(otroAlumno);
        
        Profesor prof = new Profesor();
        prof.dni = "87654321";
        prof.nombre = "Jose";
        prof.telefono = "987-654-321";
        prof.correo = "jose@gmail.com";
        prof.contratado = true;
        personas.add(prof);
        
        Profesor otroProfesor = (Profesor) prof.clone();
        personas.add(otroProfesor);
        
        System.out.println("Alumno son iguales: " + personas.get(0).equals(personas.get(1)));
        System.out.println("Profesores son iguales: " +personas.get(2).equals(personas.get(3)));     
      
    }
}
