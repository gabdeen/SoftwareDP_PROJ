/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factory;

/**
 *
 * @author Joelle Fouad Roger
 */
import bridge.Size;
import product.Drink;

public interface DrinkFactory {
    Drink createDrink(Size size);
}
