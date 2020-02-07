/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyemployee;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class SoftwareDeveloper extends Intern {
    ArrayList<String> basicBenefits;
    ArrayList<String> developerBenefits;
    final int payRate = 500;
    int hours;
    int pay;
    public SoftwareDeveloper(ArrayList<String> basicBenefits,ArrayList<String> developerBenefits, int hours)
    {
        super(basicBenefits, hours);
        this.hours = hours;
        this.basicBenefits=basicBenefits;
        this.developerBenefits=developerBenefits;
    }
    
    @Override
    public void print(){
        System.out.println("Software Developer Benefits are listed below: ");
        System.out.println(this.basicBenefits);
        System.out.println(this.developerBenefits);
        System.out.println("--------------------------------- ");
    }
    
    @Override
    public void calculatePay(){
        this.pay= this.payRate*this.hours;
        System.out.println("Software Developer Pay: " + this.pay);
    }
}

