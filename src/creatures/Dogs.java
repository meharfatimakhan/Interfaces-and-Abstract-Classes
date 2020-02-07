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
public class Dogs extends Creature {
    
    boolean checkPet;
    Pets pet;
    
    public Dogs(boolean checkPet){
        this.checkPet=checkPet;
    }
   
    @Override
    public void breathe(){
        System.out.println("I am a dog and I can breathe.");
    }
    
    @Override
    public void eatFood(){
        System.out.println("I am a dog and I can eat food.");
    }
   
    public void walk(){
        System.out.println("I am a dog and I can walk.");
    }
    
    public void playDead(){
        if (this.pet==null){
            this.pet=new DogTricks();
        }
        
        if (this.checkPet){
            pet.performTrick();
        }
        else{
            System.out.println("I am not a pet so I don't perform any tricks.");
        }
    }
}
