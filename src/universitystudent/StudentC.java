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
public class StudentC implements Student {
 
    double fee;
    public StudentC(){}
    
    @Override
    public double calculateFee(){
        System.out.print("Student Type C's Calculated Fee: ");
        double fund=(0.25)*courseCount*courseRate;
        this.fee=(courseCount*courseRate)-fund;
        return this.fee;
    }
}
