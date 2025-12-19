/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author Joelle Fouad Roger
 */

import bridge.Size;
import product.Matcha;
import product.Drink;

public class MatchaFactory implements DrinkFactory{
    @Override
    public Drink createDrink(Size size){
        return new Matcha(size);
    }
}
