/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("cual es la longitud de cola del castor: ");
        
        double cola = scanner.nextDouble();
        
        System.out.println("ingrese la velocidad del castor: ");
        
        double velocidad = scanner.nextDouble();
        
        Castor castor = new Castor(cola,velocidad);
        
        OrniVerde verdi = new OrniVerde(cola,velocidad);
        
        System.out.println("ingrese la propulsion de blue: ");
        
        double propulcionBlue = scanner.nextDouble();
        
        OrniAzul blue = new OrniAzul(propulcionBlue,cola,velocidad);
        
        System.out.println("ingrese la propulsion de blui: ");
        
        double propuBlui = scanner.nextDouble();
        
        OrniAzul blui = new OrniAzul(propuBlui,cola,velocidad);
        
        
        /*
        Castor [] hermanos = new Castor [3];
        
        try{
            
            hermanos [1] = verdi;
            
            hermanos [0] = blue;
            
            hermanos [2] = blui;
            
            
        } catch (ArrayIndexOutOfBoundsException e){
            
            System.out.println("Error");
            
        } finally {
            
            System.out.println("Los ornitisHermanos juntos al Fin");
        }
        */
        verdi.tocarOrgano();
        verdi.tocarGuitorgan();
        
        blue.nadar();
        blui.nadar();
    }
}
