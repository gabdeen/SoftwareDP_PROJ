/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author Joelle Fouad Roger
 */
public class MediumSize implements Size{
     @Override
    public double getPrice(){
        return 3.5;
    }
    @Override
    public String getName(){
        return "Medium";
    }
}
