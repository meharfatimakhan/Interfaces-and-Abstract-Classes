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
public class Birds extends Creature{
    
    boolean checkPet;
    Pets pet;
    
    public Birds(boolean checkPet){
        this.checkPet=checkPet;
    }
   
    @Override
    public void breathe(){
        System.out.println("I am a bird and I can breathe.");
    }
    
    @Override
    public void eatFood(){
        System.out.println("I am a bird and I can eat food.");
    }
    
    public void walk(){
        System.out.println("I am a bird and I can walk.");
    }
    
    public void makeNest(){
        System.out.println("I am a bird and I can make nest.");
    }
    
    public void fly(){
        System.out.println("I am a bird and I can fly.");
    }
    
    public void singSong(){
        if (this.pet==null){
            this.pet=new BirdTricks();
        }
        
        if (this.checkPet){
            pet.performTrick();
        }
        else{
            System.out.println("I am not a pet so I don't perform any tricks.");
        }
    }
}
