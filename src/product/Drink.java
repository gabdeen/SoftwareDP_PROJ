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

public abstract class Drink {
    protected Size size;
    
    public Drink(Size size){
        this.size =size;
    }
    
    public abstract String getName();
    
    public double getPrice(){
        return size.getPrice();
    }
    
    public void serve(){
        System.out.println(size.getName()+" "+ getName() + " | Price: $"+ getPrice());
    }
}
