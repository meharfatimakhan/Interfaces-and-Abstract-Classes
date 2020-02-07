/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package companyemployee;

import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Intern extends Employee {
    ArrayList<String> basicBenefits;
    final int payRate = 250;
    int hours;
    int pay;
    public Intern(ArrayList<String> basicBenefits, int hours){
       this.basicBenefits=basicBenefits;
       this.hours=hours;
    }   
    
    @Override
    public void print(){
        System.out.println("Intern Benefits are listed below: ");
        System.out.println(basicBenefits);
        System.out.println("---------------------------");
    }
    
    @Override
    public void calculatePay(){
        this.pay= this.payRate*this.hours;
        System.out.println("Intern's Pay: " + this.pay);
    }
}
