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
public class StudentB implements Student {
    
    double fee;
    public StudentB(){}
    
    @Override
    public double calculateFee(){
        System.out.print("Student Type B's Calculated Fee: ");
        this.fee=courseCount*courseRate;
        return this.fee;
    }
}
