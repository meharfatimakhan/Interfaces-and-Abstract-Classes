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
public class Rabbits extends Creature {
    
    boolean checkPet;
    Pets pet;
    
    public Rabbits(boolean checkPet){
        this.checkPet=checkPet;
    }
   
    @Override
    public void breathe(){
        System.out.println("I am a rabbit and I can breathe.");
    }
    
    @Override
    public void eatFood(){
        System.out.println("I am a rabbit and I can eat food.");
    }
    
    public void hop(){
        System.out.println("I am a rabbit and I can hop.");
    }
    public void doSomething(){
        if (this.pet==null){
            this.pet=new RabbitTrick();
        }
        
        if (this.checkPet){
            pet.performTrick();
        }
        else{
            System.out.println("I am not a pet so I don't perform any tricks.");
        }
    }
}
