/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffeeshop;

/**
 *
 * @author Joelle Fouad Roger
 */

import bridge.*;
import factory.*;
import product.Drink;

public class CoffeeShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Size small = new SmallSize();
        Size large = new LargeSize();
        
        DrinkFactory coffeeFactory = new CoffeeFactory();
        DrinkFactory matchaFactory = new MatchaFactory();
        DrinkFactory juiceFactory = new JuiceFactory();
        
        Drink order1= coffeeFactory.createDrink(small);
        Drink order2= matchaFactory.createDrink(large);
        Drink order3= juiceFactory.createDrink(new MediumSize());
        
        order1.serve();
        order2.serve();
        order3.serve();
    }
    
}
