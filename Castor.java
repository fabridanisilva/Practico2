/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

import java.util.Random;

/**
 *
 * @author fabri
 */
public class Castor {
    double cola;
    double velocidad;

    public Castor(double cola, double velocidad) {
        this.cola = cola;
        this.velocidad = velocidad;
    }
    
        public void tocarGuitarra(){
            Random random = new Random();
            int num = 1 + random.nextInt(6 - 1 + 1);
            System.out.println("toca cuerda " + num);
        }
        
        public void nadar(){
        
            System.out.println("velocidad: " + velocidad);
        
        }
}
