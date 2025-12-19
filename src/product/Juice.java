/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

/**
 *
 * @author Joelle Fouad Roger
 */

import bridge.Size;

public class Juice extends Drink{
    public Juice(Size size){
        super(size);
    }
    
    @Override 
    public String getName(){
        return "Juice";
    }
}
