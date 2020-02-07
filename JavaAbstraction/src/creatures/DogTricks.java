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
public class DogTricks implements Pets {
    public DogTricks(){}
    @Override
    public void performTrick(){
        System.out.println("I am a dog and I can play dead!"); 
    }
}
