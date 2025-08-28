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
public class OrniVerde extends Castor implements Pata{

    public OrniVerde(double cola, double velocidad) {
        super(cola, velocidad);
    }





    @Override
    public void tocarOrgano() {
        System.out.println("Do-Re-Mi");
        Scanner scanner = new Scanner(System.in);
        System.out.println("oprima una tecla:");
        String tecla = scanner.next();
        System.out.println("Fa-Sol-La-Si");
    }
    
    
    public void tocarGuitorgan(){
        super.tocarGuitarra();
        tocarOrgano();
        
    
    }
    
    
    
}
