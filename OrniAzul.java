/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author fabri
 */
public class OrniAzul extends Castor{
    double propulsion;

    public OrniAzul(double propulsion, double cola, double velocidad) {
        super(cola, velocidad);
        this.propulsion = propulsion;
    }
    
    
    
    
    
    @Override
    public void nadar(){
        System.out.println("velocidad: " + velocidad+propulsion);
    }
    
    
}
