/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatures;

/**
 *
 * @author Dell
 */
public class RabbitTrick implements Pets {
    RabbitTrick(){}
    @Override
    public void performTrick(){
        System.out.println("I am a rabbit and I dont do anything!"); 
    }
}
