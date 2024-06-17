/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constructor_abstract.factory;

import java.util.Scanner;

/**
 *
 * @author utente
 */
public class Constructor_abstractFactory {

    public static void main(String[] args) 
    {
        
        System.out.println("Ingrese 0 para fábrica clásica y 1 para fábrica moderna");
        Scanner sc = new Scanner(System.in);
        int opc = sc.nextInt();
        
        switch (opc) {
            case 0:
                mostrarCatalogo(new ClassicFactory());
                break;
            case 1:
                mostrarCatalogo(new ModernFactory());
                break;
            default:
                System.out.println("Ingrese una opción válida");
                break;
        }  
        
    }
    
    private static void mostrarCatalogo(AbstractFactory fc)
    {
        Mueble mb = fc.crearMueble();
        Silla si = fc.crearSilla();
        
        mb.tipoMueble();
        si.tipoSilla();
    }
}
