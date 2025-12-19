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

public class Matcha extends Drink{
    public Matcha(Size size){
        super(size);
    }
    
    @Override 
    public String getName(){
        return "Matcha";
    }
}
