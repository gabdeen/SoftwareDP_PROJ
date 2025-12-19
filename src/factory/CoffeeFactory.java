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
import product.Coffee;
import product.Drink;

public class CoffeeFactory implements DrinkFactory{
    @Override
    public Drink createDrink(Size size){
        return new Coffee(size);
    }
    
}
