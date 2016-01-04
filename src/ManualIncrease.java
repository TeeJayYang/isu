/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TJ Yang @2015
 */
public class ManualIncrease {
    public static int incrementAmount;
    public ManualIncrease(){
        incrementAmount = 1;
    }
    public static void increaseIncrement(int amount){
        incrementAmount += amount;
    }
}
