/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitystudent;

/**
 *
 * @author Dell
 */
public class StudentA implements Student{
    
    
    double fee;
    public StudentA(){}
    
    @Override
    public double calculateFee(){
        System.out.print("Student Type A's Calculated Fee: ");
        fee=courseCount*courseRate;
        this.fee=fee*(0.5);
        return this.fee;
    }
}
